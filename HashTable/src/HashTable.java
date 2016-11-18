/**
 * 
 */

/**
 * @author mclark17
 *
 */
public class HashTable<T1, T2> implements IHashTable<T1, T2> {
	private T1[] data;
	private int capacity;
	private int size;
	
	public HashTable () {
		data = (T1[])new Object[capacity];
		size = 0;
	}
	
	private int hash(T1 key) {
		return key.hashCode();
	}
	
	private void shrink() {
		
	}
	
	private void grow() {
		
	}

	@Override
	public void add(T1 key, T2 value) {
		
	}

	@Override
	public boolean exists(T1 key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T2 get(T1 key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(T1 key) {
		// TODO Auto-generated method stub
		
	}

}
