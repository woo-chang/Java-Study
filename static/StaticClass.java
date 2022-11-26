package Lab.staticTest;

public class StaticClass {

  public static TestObject testObject;

  public StaticClass() {
    StaticClass.testObject = new TestObject();
  }
}
