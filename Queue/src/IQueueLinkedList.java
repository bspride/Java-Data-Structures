/**
 * 
 */

/**
 * @author mclark17
 *
 */
public interface IQueueLinkedList<T> {
	public void enqueue(T value);
	public T dequeue();
	public boolean isEmpty();
}
