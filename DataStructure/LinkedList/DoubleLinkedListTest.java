package DataStructure.LinkedList;

public class DoubleLinkedListTest {

  public static void main(String[] args) {

    DoubleLinkedList<Integer> MyLinkedList = new DoubleLinkedList<Integer>();

    MyLinkedList.addNode(1);
    MyLinkedList.addNode(2);
    MyLinkedList.addNode(3);

    MyLinkedList.printAll();

    System.out.println("=================");

    System.out.println(MyLinkedList.searchFromHead(2));

    System.out.println("=================");

    System.out.println(MyLinkedList.searchFromTail(3));

    System.out.println("=================");

    System.out.println(MyLinkedList.searchFromTail(12));

    System.out.println("=================");
  }

}
