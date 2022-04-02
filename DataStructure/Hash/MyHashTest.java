package DataStructure.Hash;

public class MyHashTest {

  public static void main(String[] args) {
    MyHash myHash = new MyHash(20);

    myHash.saveData("DaveLee", "01022223333");
    myHash.saveData("fun-coding", "01033334444");
    System.out.println(myHash.getData("DaveLee"));
  }
}
