package DataStructure.LinkedList;

public class SingleLinkedListTest {

  public static void main(String[] args) {
    SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();
    MyLinkedList.addNode(1);

    System.out.println(MyLinkedList.head.data);

    MyLinkedList.addNode(2);

    System.out.println(MyLinkedList.head.next.data);

    MyLinkedList.addNode(3);

    System.out.println("--------------------");

    MyLinkedList.printAll();
  }

}
