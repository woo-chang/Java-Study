package Enum;

public class TestFive {

  public enum Operation {
    PLUS, MINUS, TIMES, DIVIDE;

    public double apply(double x, double y) {
      switch (this) {
        case PLUS:
          return x + y;
        case MINUS:
          return x - y;
        case TIMES:
          return x * y;
        case DIVIDE:
          return x / y;
      }
      throw new AssertionError();
    }
  }

  public static void main(String[] args) {
    System.out.println(Operation.PLUS.apply(10, 5));
    System.out.println(Operation.MINUS.apply(10, 5));
    System.out.println(Operation.TIMES.apply(10, 5));
    System.out.println(Operation.DIVIDE.apply(10, 5));
  }


}
