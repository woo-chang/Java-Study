package Lab.Static;

public class StaticClass {

  public static TestObject testObject;

  public StaticClass() {
    StaticClass.testObject = new TestObject();
  }
}
