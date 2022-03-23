package TheEssenceOfJava.Chapter04;

public class SwitchExample {

  public static void main(String[] args) {
    final int ONE = 1;
    final String STR = "hello";

    int a = 2;

    switch (a) {
      case ONE:
        System.out.println(1);
        break;
      case 2:
        System.out.println(2);
        break;
      case 3:
        System.out.println(3);
        break;
      default:
        System.out.println("NOTING");
    }

    String str = "hello";

    switch (str) {
      case "Hello":
        System.out.println("Hello");
        break;
      case STR:
        System.out.println("hello");
        break;
      default:
        System.out.println("NOTHING");
    }

    char ch = 'a';

    switch (ch) {
      case 'a':
        System.out.println("a");
        break;
      case 'b':
        System.out.println("b");
        break;
      default:
        System.out.println("NOTHING");
    }
  }

}
