package DataStructure.Tree;

public class NodeManagement {

  private Node head;

  static class Node {
    private Node left;
    private Node right;
    int value;

    public Node(int data) {
      this.left = null;
      this.right = null;
      this.value = data;
    }
  }

  public boolean insertNode(int data) {
    // CASE1: Node가 하나도 없을 때
    if (this.head == null) {
      this.head = new Node(data);
    } else {
      // CASE2: Node가 하나 이상 들어가 있을 때
      Node findNode = this.head;
      while (true) {
        // CASE2-1: 현재 Node의 왼쪽에 Node가 들어가야할 때
        if (data < findNode.value) {
          if (findNode.left != null) {
            findNode = findNode.left;
          } else {
            findNode.left = new Node(data);
            break;
          }
        } else { // CASE2-2: 현재 Node의 오른쪽에 Node가 들어가야할 때
          if (findNode.right != null) {
            findNode = findNode.right;
          } else {
            findNode.right = new Node(data);
            break;
          }
        }
      }
    }
    return true;
  }

  public Node search(int data) {
    // CASE1: Node가 하나도 없을 때
    if (this.head == null) {
      return null;
    } else { // CASE2: Node가 하나라도 있을 때
      Node findNode = this.head;
      while (findNode != null) {
        if (findNode.value == data) {
          return findNode;
        } else if (findNode.value > data) {
          findNode = findNode.left;
        } else {
          findNode = findNode.right;
        }
      }
      return null;
    }
  }

}
