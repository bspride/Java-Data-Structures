/**
 * 
 */

/**
 * @author mclark17
 *
 */
public interface IHashItem<T1, T2> {
	public boolean isDeleted();
	public T1 getKey();
	public T2 getValue();
}
