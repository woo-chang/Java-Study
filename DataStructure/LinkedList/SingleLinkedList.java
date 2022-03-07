package DataStructure.LinkedList;

public class SingleLinkedList<T> {

  public Node<T> head = null;

  public void addNode(T data) {
    if (head == null) {
      head = new Node<T>(data);
    } else {
      Node<T> node = this.head;
      while(node.next != null) {
        node = node.next;
      }
      node.next = new Node<T>(data);
    }
  }

  public void printAll() {
    Node<T> node = this.head;
    while(node != null) {
      System.out.println(node.data);
      node = node.next;
    }
  }
}
