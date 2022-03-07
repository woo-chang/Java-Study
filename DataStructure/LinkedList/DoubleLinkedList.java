package DataStructure.LinkedList;

public class DoubleLinkedList<T> {

  public NodeByDouble<T> head = null;
  public NodeByDouble<T> tail = null;

  public static class NodeByDouble<T> {
    T data;
    NodeByDouble<T> prev = null;
    NodeByDouble<T> next = null;

    public NodeByDouble(T data) {
      this.data = data;
    }
  }

  public void addNode(T data) {
    NodeByDouble<T> node = this.head;
    if(node == null) {
      this.head = new NodeByDouble<T>(data);
      this.tail = this.head;
    } else {
      while(node.next != null) {
        node = node.next;
      }
      node.next = new NodeByDouble<T>(data);
      node.next.prev = node;
      this.tail = node.next;
    }
  }

  public void printAll() {
    NodeByDouble<T> node = this.head;
    while(node != null) {
      System.out.println(node.data);
      node = node.next;
    }
  }

  public T searchFromHead(T isData) {
    if(this.head == null) {
      return null;
    } else {
      NodeByDouble<T> node = this.head;
      while(node != null) {
        if(node.data == isData) {
          return node.data;
        } else {
          node = node.next;
        }
      }
      return null;
    }
  }

  public T searchFromTail(T isData) {
    if(this.tail == null) {
      return null;
    } else {
      NodeByDouble<T> node = this.tail;
      while(node != null) {
        if(node.data == isData) {
          return node.data;
        } else {
          node = node.prev;
        }
      }
      return null;
    }
  }
}
