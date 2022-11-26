package DataStructure.Hash;

public class MyHashLinearTest {

  public static void main(String[] args) {

    MyHashLinear myHashLinear = new MyHashLinear(20);

    myHashLinear.saveData("DaveLee", "01022223333");
    myHashLinear.saveData("fun-coding", "01033334444");
    myHashLinear.saveData("David", "01055556666");
    myHashLinear.saveData("Dave", "01077778888");

    System.out.println(myHashLinear.getData("DaveLee"));
    System.out.println(myHashLinear.getData("David"));
    System.out.println(myHashLinear.getData("Noting"));
  }
}
