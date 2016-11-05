public class Node<T> {
  private T item;
  private Node<T> next;

  public Node(T newItem) {
    item = newItem;
    next = null;
  }

  public Node(T newItem, Node<T> nextNode) {
    item = newItem;
    next = nextNode;
  }

  public void setItem(T newItem) {
    item = newItem;
  }

  public T getItem() {
    return item;
  }

  public void setNext(Node<T> nextNode) {
    node = nextNode;
  }

  public Node<T> getNext() {
    return next;
  }
}