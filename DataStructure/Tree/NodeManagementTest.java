package DataStructure.Tree;

public class NodeManagementTest {

  public static void main(String[] args) {
    NodeManagement nodeManagement = new NodeManagement();

    nodeManagement.insertNode(1);
    nodeManagement.insertNode(2);
    nodeManagement.insertNode(3);

    System.out.println(nodeManagement.search(1).value);
    System.out.println(nodeManagement.search(12));

    System.out.println("====================================");

    NodeManagement myTree = new NodeManagement();
    myTree.insertNode(10);
    myTree.insertNode(15);
    myTree.insertNode(13);
    myTree.insertNode(11);
    myTree.insertNode(14);
    myTree.insertNode(18);
    myTree.insertNode(16);
    myTree.insertNode(19);
    myTree.insertNode(17);
    myTree.insertNode(7);
    myTree.insertNode(8);
    myTree.insertNode(6);
    System.out.println(myTree.delete(15));
    System.out.println("HEAD: " + myTree.head.value);
    System.out.println("HEAD LEFT: " + myTree.head.left.value);
    System.out.println("HEAD LEFT LEFT: " + myTree.head.left.left.value);
    System.out.println("HEAD LEFT RIGHT: " + myTree.head.left.right.value);

    System.out.println("HEAD RIGHT: " + myTree.head.right.value);
    System.out.println("HEAD RIGHT LEFT: " + myTree.head.right.left.value);
    System.out.println("HEAD RIGHT RIGHT: " + myTree.head.right.right.value);

    System.out.println("HEAD RIGHT RIGHT LEFT: " + myTree.head.right.right.left.value);
    System.out.println("HEAD RIGHT RIGHT RIGHT: " + myTree.head.right.right.right.value);
  }

}
