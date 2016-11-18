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
		data = new HashItem[capacity];
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
		
	}
	
	private void grow() {
		
	}

}
