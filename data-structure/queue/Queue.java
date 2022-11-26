package DataStructure.Queue;

import java.util.ArrayList;

public class Queue<T> {

  private ArrayList<T> queueByList = new ArrayList<T>();

  public void enqueue(T item) {
    queueByList.add(item);
  }

  public T dequeue() {
    if(queueByList.isEmpty()) {
      return null;
    }
    return queueByList.remove(0);
//    int length = queueByList.size();
//    T result = null;
//    if(length > 0) {
//      result = queueByList.get(0);
//      queueByList.remove(0);
//    }
//    return result;
  }

  public boolean isEmpty() {
    return queueByList.isEmpty();
  }

}
