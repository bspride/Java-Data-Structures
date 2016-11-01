public interface MCVectorInterface {
  public int size();
  public boolean isEmpty();
  public Object get(index)
                  throws ListIndexOutOfBoundsException;
  public void append(Object item);
  public void insert(Object item, int index);
  public void prepend(Object item);
  public Object pop();
  public void delete(int index);
                  throws ListIndexOutOfBoundsException;
  public void remove(Object value);
  public int find(Object value);
}