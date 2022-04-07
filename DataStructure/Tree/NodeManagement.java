package DataStructure.Tree;

public class NodeManagement {

  Node head;

  static class Node {
    Node left;
    Node right;
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

  public boolean delete(int value) {
    boolean searched = false;

    Node currParentNode = this.head;
    Node currNode = this.head;

    // 코너 케이스1: Node가 하나도 없을 때
    if (this.head == null) {
      return false;
    } else {
      // 코너 케이스2: Node가 단지 하나만 있고, 해당 Node가 삭제할 Node 일 때
      if (this.head.value == value && this.head.left == null && this.head.right == null) {
        this.head = null;
        return true;
      }

      while (currNode != null) {
        if (currNode.value == value) {
          searched = true;
          break;
        } else if (currNode.value > value) {
          currParentNode = currNode;
          currNode = currNode.left;
        } else {
          currParentNode = currNode;
          currNode = currNode.right;
        }
      }

      if (searched == false) {
        return false;
      }

      // currNode는 해당 데이터를 가지고 있는 노드
      // currParentNode는 해당 데이터를 가지고 있는 노드의 부모 노드
      // CASE1: 삭제할 노드가 Leaf Node인 경우
      if (currNode.left == null && currNode.right == null) {
        if (value < currParentNode.value) {
          currParentNode.left = null;
          // 안써도 되지만 명시적으로 작성
          currNode = null;
        } else {
          currParentNode.right = null;
          // 안써도 되지만 명시적으로 작성
          currNode = null;
        }
        return true;
      } else if (currNode.left != null && currNode.right == null) { // CASE2: 삭제할 노드 왼쪽 자식 노드 존재
        if (value > currParentNode.value) {
          currParentNode.right = currNode.left;
          currNode = null;
        } else {
          currParentNode.left = currNode.left;
          currNode = null;
        }
        return true;
      } else if (currNode.left == null && currNode.right != null) { // CASE3: 삭제할 노드 오른쪽 자식 노드 존재
        if (value > currParentNode.value) {
          currParentNode.right = currNode.right;
          currNode = null;
        } else {
          currParentNode.left = currNode.right;
          currNode = null;
        }
        return true;
      } else { // CASE4: 삭제할 노드 자식 노드 2개 존재
        // CASE4-1: 삭제할 노드가 부모 노드 왼쪽에 있을 때
        if (value < currParentNode.value) {
          Node changeNode = currNode.right;
          Node changeParentNode = currNode.right;

          while(changeNode.left != null) {
            changeParentNode = changeNode;
            changeNode = changeNode.left;
          }

          // CASE4-1-1: 바꾸는 노드의 오른쪽 자식이 존재할 때
          if (changeNode.right != null) {
            changeParentNode.left = changeNode.right;
          } else { // CASE4-1-2: 바꾸는 노드의 오른쪽 자식이 존재하지 않을 때
            changeParentNode.left = null;
          }

          currParentNode.left = changeNode;
          changeNode.left = currNode.left;
          changeNode.right = currNode.right;
          currNode = null;
        } else { // CASE4-1: 삭제할 노드가 부모 노드 오른쪽에 있을 때
          Node changeNode = currNode.right;
          Node changeParentNode = currNode.right;

          while(changeNode.left != null) {
            changeParentNode = changeNode;
            changeNode = changeNode.left;
          }

          // CASE4-1-1: 바꾸는 노드의 오른쪽 자식이 존재할 때
          if (changeNode.right != null) {
            changeParentNode.left = changeNode.right;
          } else { // CASE4-1-2: 바꾸는 노드의 오른쪽 자식이 존재하지 않을 때
            changeParentNode.left = null;
          }

          currParentNode.right = changeNode;
          changeNode.left = currNode.left;
          changeNode.right = currNode.right;
          currNode = null;
        }

        return true;
      }
    }


  }

}
