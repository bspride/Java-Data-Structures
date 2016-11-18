/**
 * 
 */

/**
 * @author mclark17
 *
 */
public class HashItem<T1, T2> implements IHashItem<T1, T2> {
	private int flag;
	private T1 key;
	private T2 value;
	
	public HashItem(T1 key, T2 value) {
		this.flag = 0;
		this.key = key;
		this.value = value;
	}

	@Override
	public boolean isDeleted() {
		return this.flag == 1;
	}

	@Override
	public T1 getKey() {
		return this.key;
	}

	@Override
	public T2 getValue() {
		return this.value;
	}

	@Override
	public void setDeleted() {
		this.flag = 1;
	}
}
