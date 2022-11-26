package Lab.staticTest;

public class Printer {

  private static Printer printer;

  public static synchronized Printer getInstance() {
    if (printer == null) {
      printer = new Printer();
    }
    return printer;
  }

  public void print() {
    System.out.println("print");
  }

  public static void main(String[] args) {
    Printer printer = Printer.getInstance();
    printer.print();
  }
}
