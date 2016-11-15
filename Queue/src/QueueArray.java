/**
 * 
 */

/**
 * @author mclark17
 *
 */
public class QueueArray<T> implements IQueueArray<T> {
	private T[] data;
	private int size;
	
	@SuppressWarnings("unchecked")
	public QueueArray (int capacity) {
		data = (T[]) new Object[capacity];
	}
	
	@Override
	public void enqueue(T value) {
		if(this.isFull()) {
			return;
		}
		
		data[this.size] = value;
		this.size++;
	}

	@Override
	public T dequeue() {
		T value = data[0];
		
		System.arraycopy(this.data, 1, this.data, 0, this.size - 1);
		this.size--;
		
		return value;
	}

	@Override
	public boolean isEmpty() {
		return data.length == 0;
	}

	@Override
	public boolean isFull() {
		return data.length == size;
	}

}
