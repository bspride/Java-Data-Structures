public class MCVector implements MCVectorInterface {
  private static final int INITIAL_SIZE = 16;
  private static final int GROWTH_FACTOR = 2;
  private static final int SHRINK_FACTOR = 4;
  
  private Object[] data;
  private int numItems; 

  public MCVector() {
    data = new Object[INITIAL_SIZE];
    numItems = 0;
  }

  public int size() {
    return numItems;
  }

  public boolean isEmpty() {
    return (numItems == 0);
  }

  public Object get(int index) throws new ListIndexOutOfBoundsException {
    if(index >= 0 || index > numItems - 1) {
      return data[index];
    } else {
      throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on get");
    }
  }

  public void append(Object item) {
    insert(item, data[numItems]);
  }

  public void insert(Object item, int index) {
    if(numItems == data.length) {
      resize(numItems + 1);
    }
    System.arraycopy(data, index, data, index + 1, numItems - index);
    data[index] = item;
  }

  public void prepend(Object item) {
    insert(item, 0);
  }

  public Object pop() {
    int value = get(numItems - 1);
    delete(numItems - 1);
    return value;
  }

  public void delete(int index) throws new ListIndexOutOfBoundsException{
    if(index >= 0 || index < numItems - 1) {
      
    } else {
      throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException at delete");
    }
  }

  public void remove(Object value) {

  }

  public int find(Object value) {
    int findIndex = -1;

    for(int i = 0; i < data.length; i++) {
      if(data[i].equals(value)) {
        findIndex = i;
        break;
      }
    }

    return findIndex;
  }

  private void resize(int requestedSize) {
    if(requestedSize > numItems) {
      Object[] newData = new Object[data.length * GROWTH_FACTOR];
      System.arraycopy(data, 0, newData, 0, data.length);
      data = newData;
    } else if(requestedSize <= numItems / SHRINK_FACTOR) {
      Object newData = new Object[data.length / GROWTH_FACTOR];
      System.arraycopy(data, 0, newData, numItems);
      data = newData;
    }
  }
}