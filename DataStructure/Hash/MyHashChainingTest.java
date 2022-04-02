package DataStructure.Hash;

public class MyHashChainingTest {

  public static void main(String[] args) {
    MyHashChaining myHashChaining = new MyHashChaining(20);

    myHashChaining.saveData("DaveLee", "01022223333");
    myHashChaining.saveData("fun-coding", "01033334444");
    myHashChaining.saveData("David", "01055556666");
    myHashChaining.saveData("Dave", "01077778888");

    System.out.println(myHashChaining.getData("DaveLee"));
    System.out.println(myHashChaining.getData("Dave"));
  }

}
