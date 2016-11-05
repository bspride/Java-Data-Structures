public interface MCLinkedListInterface<T> {
  public int size();
  public boolean isEmpty();
  public T value_at(int index);
  public void add(T value);
  public void push_front(T value);
  public T pop_front();
  public void push_back(T value);
  public T pop_back();
  public T front();
  public T back();
  public void insert(int index, T value);
  public void erase(int index);
  public T value_n_from_end(n);
  public void reverse();
  public void remove_value(T value);
}