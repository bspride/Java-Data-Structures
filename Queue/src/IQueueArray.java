/**
 * 
 */

/**
 * @author mclark17
 *
 */
public interface IQueueArray<T> {
	public void enqueue(T value);
	public T dequeue();
	public boolean isEmpty();
	public boolean isFull();
}
