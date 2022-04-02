package DataStructure.Hash;

public class MyHashTest {

  public static void main(String[] args) {
    MyHash myHash = new MyHash(20);

    myHash.saveData("DaveLee", "01022223333");
    myHash.saveData("fun-coding", "01033334444");

    // 기존 해쉬 함수의 경우 중복되는 문제 발생
    myHash.saveData("David", "01055556666");
    myHash.saveData("Dave", "01077778888");

    System.out.println(myHash.getData("DaveLee"));
  }
}
