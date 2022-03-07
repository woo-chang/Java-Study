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

  // 리팩토링 전
  public void addNodeInside1(T data, T isData) {
    Node<T> node = this.head;
    while(node != null && node.data != isData) {
      node = node.next;
    }

    if (node != null) {
      Node<T> newNode = new Node<T>(data);
      newNode.next = node.next;
      node.next = newNode;
    }
  }

  // 리팩토링 후
  public void addNodeInside(T data, T isData) {
    Node<T> searchNode = search(isData);
    if(searchNode == null) {
      this.addNode(data);
    } else {
      Node<T> nextNode = searchNode.next;
      searchNode.next = new Node<T>(data);
      searchNode.next.next = nextNode;
    }
  }

  public Node<T> search(T data) {
    Node<T> node = this.head;
    while(node != null && node.data != data) {
      node = node.next;
    }

    return node;
  }

  public boolean delNode(T data) {
    Node<T> node = this.head;
    if(node == null) {
      return false;
    } else {
      if(node.data == data) {
        this.head = this.head.next;
        return true;
      } else {
        while(node.next != null) {
          if(node.next.data == data) {
            node.next = node.next.next;
            return true;
          } else {
            node = node.next;
          }
        }
        return false;
      }
    }
  }
}
