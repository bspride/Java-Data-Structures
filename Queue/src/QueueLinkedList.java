import java.util.*;

public class QueueLinkedList<T> implements IQueueLinkedList<T> {
	
	LinkedList<T> data;
	
	public QueueLinkedList() {
		data = new LinkedList<T>();
	}

	@Override
	public void enqueue(T value) {
		data.add(value);
	}

	@Override
	public T dequeue() {
		return data.removeFirst();
	}

	@Override
	public boolean empty() {
		return data.isEmpty();
	}

}
