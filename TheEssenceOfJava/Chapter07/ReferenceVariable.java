package TheEssenceOfJava.Chapter07;

public class ReferenceVariable {

  public static void main(String[] args) {
    Parent parent = new Parent();
    Child child = new Child();
    Parent parent2 = new Child();

    System.out.println(parent.x);
    System.out.println(child.x);
    // 참조변수의 멤버변수
    System.out.println(parent2.x);

    parent.method();
    child.method();
    // 실제 인스턴스의 메서드 호출
    parent2.method();

  }

  static class Parent {
    int x = 100;

    void method() {
      System.out.println("Parent Method");
    }
  }

  static class Child extends Parent {
    int x = 200;

    void method() {
      System.out.println("Child Method");
    }
  }
}
