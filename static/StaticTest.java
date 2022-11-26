package Lab.staticTest;

public class StaticTest {

  public static void main(String[] args) {
    StaticClass st1 = new StaticClass();
    StaticClass st2 = new StaticClass();
    StaticClass st3 = new StaticClass();

    System.out.println(st1.testObject);
    System.out.println(st2.testObject);
    System.out.println(st3.testObject);
  }
}
