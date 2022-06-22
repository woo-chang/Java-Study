package Presentation.Enum;

public class TestSix {

  public enum Operation {
    PLUS {
      public double apply(double x, double y) { return x + y; }
    },
    MINUS {
      public double apply(double x, double y) { return x - y; }
    },
    TIMES {
      public double apply(double x, double y) { return x * y; }
    },
    DIVIDE {
      public double apply(double x, double y) { return x / y; }
    };

    public abstract double apply(double x, double y);
  }

  public static void main(String[] args) {
    System.out.println(Operation.PLUS.apply(10, 5));
    System.out.println(Operation.MINUS.apply(10, 5));
    System.out.println(Operation.TIMES.apply(10, 5));
    System.out.println(Operation.DIVIDE.apply(10, 5));
  }

}
