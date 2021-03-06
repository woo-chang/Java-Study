package DataStructure.Heap;

public class HeapTest {

  public static void main(String[] args) {
    Heap heap = new Heap(15);
    heap.insert(10);
    heap.insert(8);
    heap.insert(5);
    heap.insert(4);
    heap.insert(20);

    System.out.println(heap.heapArray);

    heap.pop();

    System.out.println(heap.heapArray);
  }
}
