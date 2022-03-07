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

    System.out.println("--------------------");

    MyLinkedList.addNodeInside1(4, 2);

    MyLinkedList.printAll();

    System.out.println("--------------------");

    MyLinkedList.addNodeInside1(5, 7);

    MyLinkedList.printAll();

    System.out.println("--------------------");

    MyLinkedList.addNodeInside(7, 4);

    MyLinkedList.printAll();

    System.out.println("--------------------");

    MyLinkedList.addNodeInside(7, 11);

    MyLinkedList.printAll();

    System.out.println("--------------------");

    System.out.println(MyLinkedList.delNode(3));

    MyLinkedList.printAll();

    System.out.println("--------------------");

    System.out.println(MyLinkedList.delNode(22));

    MyLinkedList.printAll();

    System.out.println("--------------------");

  }

}
