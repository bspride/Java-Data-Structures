/**
 * 
 */

/**
 * @author mclark17
 *
 */
public interface IHashTable<T1, T2> {
	public void add(T1 key, T2 value);
	public boolean exists(T1 key);
	public T2 get(T1 key);
	public void remove(T1 key);
}
