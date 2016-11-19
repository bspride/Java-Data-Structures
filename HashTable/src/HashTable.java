/**
 * 
 */

/**
 * @author mclark17
 *
 */
public class HashTable<T1, T2> implements IHashTable<T1, T2> {
	private IHashItem<T1, T2>[] data;
	private int capacity;
	private int size;
	
	public HashTable () {
		data = new IHashItem[capacity];
		size = 0;
	}

	@Override
	public void add(T1 key, T2 value) {
		HashItem<T1, T2> insert = new HashItem<T1, T2>(key, value);
		
		if(this.size >= this.capacity/2) {
			this.grow();
		}
		
		int index = this.hash(key);
		while(this.data[index] != null || !this.data[index].isDeleted()) {
			index = (index+1)%this.capacity;
		}
		
		this.data[index] = insert;
		this.size++;
	}

	@Override
	public boolean exists(T1 key) {
		int index = this.find(key);
		if(index != -1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public T2 get(T1 key) {
		int index = this.find(key);
		if(index != -1) {
			return this.data[index].getValue();
		} else {
			return null;
		}
	}

	@Override
	public void remove(T1 key) {
		int index = this.find(key);
		if(index != -1) {
			this.data[index].setDeleted();
		}
		
		this.size--;
		if(this.size <= this.capacity/4) {
			this.shrink();
		}
	}
	
	private int find(T1 key) {
		int index = this.hash(key);
		int originalIndex = index;
		
		while(this.data[index] != null) {
			if(!this.data[index].isDeleted() && this.data[index].getKey().equals(key)) {
				return index;
			}
			index++;
			if(index == originalIndex) {
				break;
			}
		}
		
		return -1;
	}

	private int hash(T1 key) {
		return key.hashCode();
	}
	
	private void shrink() {
		this.capacity /= 2;
		int newSize = 0;
		IHashItem[] newArray = new IHashItem[this.capacity];
		
		for(int i = 0; i < this.data.length; i++) {
			if(!this.data[i].isDeleted()) {
				int index = this.hash(this.data[i].getKey());
				while(this.data[index] != null) {
					index = (index+1)%this.capacity;
				}
				newArray[index] = this.data[i];
				newSize++;
			}
		}
		
		this.size = newSize;
		this.data = newArray;
	}
	
	private void grow() {
		this.capacity *= 2;
		int newSize = 0;
		IHashItem[] newArray = new IHashItem[this.capacity];
		
		for(int i = 0; i < this.data.length; i++) {
			if(!this.data[i].isDeleted()) {
				int index = this.hash(this.data[i].getKey());
				while(newArray[index] != null) {
					index = (index+1)%this.capacity;
				}
				newArray[index] = this.data[i];
				newSize++;
			}
		}
		
		this.size = newSize;
		this.data = newArray;
	}

}
