package TheEssenceOfJava.Chapter05;

public class ArrayExample {

  public static void main(String[] args) {

    int[] score = new int[] {10, 20, 30, 40, 50};
    int[] score2 = {10, 20, 30, 40, 50};
    int[] score3;

    // 아래의 코드는 에러 발생, 참조 공간에 값을 저장하려고 하기 때문
    // score3 = {10, 20, 30 ,40 50};

    add(new int[] {10, 20, 30, 40 ,50});
    // 아래의 코드는 에러 발생, 위와 같은 이유
    //add({10, 20, 30, 40 ,50})

    System.out.println(score);

    char[] string = {'a', 'b', 'c', 'd'};
    // 문자 배열은 타입@주소 형식이 아닌 붙여서 출력
    // 문자 배열은 그렇게 출력하도록 설정되어 있기 때문
    System.out.println(string);

    String str = "TestString";
    System.out.println(str.charAt(1));
    System.out.println(str.length());
    System.out.println(str.equals("TestString"));
    System.out.println(str.equalsIgnoreCase("teststring"));
    System.out.println(str.toCharArray());
    System.out.println(str.substring(2, 6));
  }

  public static void add(int[] arr) {}

}
