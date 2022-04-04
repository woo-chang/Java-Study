package DataStructure.Tree;

public class NodeManagementTest {

  public static void main(String[] args) {
    NodeManagement nodeManagement = new NodeManagement();

    nodeManagement.insertNode(1);
    nodeManagement.insertNode(2);
    nodeManagement.insertNode(3);

    System.out.println(nodeManagement.search(1).value);
    System.out.println(nodeManagement.search(12));
  }

}
