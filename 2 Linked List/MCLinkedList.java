public class MCLinkedList<T> implements MCLinkedListInterface<T> {
  private Node<T> head;
  private Node<T> tail;
  private int numItems;

  public MCLinkedList() {
    numItems = 0;
    head = null;
    tail = null;
  }

  public int size() {
    return numItems;
  }

  public boolean isEmpty() {
    return numItems == 0;
  }

  public T value_at(int index) {
    return find(index).getItem();
  }

  public void add(T value) {
    Node newNode = new Node(value);
    if(isEmpty()) {
      head = newNode;
      tail = newNode;
    } else {
      tail.setNext(newNode);
      tail = newNode;
    }
    numItems++;
  }

  public void push_front(T value) {
    Node newNode = new Node(value);
    if(isEmpty()) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.setNext(head);
      head = newNode;
    }
    numItems++;
  }

  public T pop_front() {
    Node oldHead = head;

    if(head == tail) {
      head = null;
      tail = null;
    } else {
      head = head.getNext();
    }
    numItems--;
    return oldHead.getItem();
  }

  public void push_back(T value) {
    Node newNode = new Node(value);
    
    if(isEmpty()) {
      head = newNode;
      tail = newNode;
    } else {
      tail.setNext(newNode);
      tail = newNode;
    }
    numItems++;
  }

  public T pop_back() {
    Node oldTail = tail;
    if(head == tail) {
      head = null;
      tail = null;
    } else {
      tail = find(numItems -1);
      tail.setNext(null);
    }
    numItems--;
    return oldTail.getItem();
  }

  public T front() {
    return head.getItem();
  }
   
  public T back() {
    return tail.getItem();
  }

  public void insert(int index, T value) {
    
  }

  public void erase(int index) {

  }

  public T value_n_from_end(n) {

  }

  public void reverse() {

  }

  public void remove_value(T value) {

  }

  private Node<T> find(int index) {
    Node curr = head;
    for(int i = 0; i < index; i++) {
      curr = curr.getNext();
    }
    return curr;
  }
}