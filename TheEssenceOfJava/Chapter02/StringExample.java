package TheEssenceOfJava.Chapter02;

public class StringExample {

  public static void main(String[] args) {
    String name = "Ja" + "va";
    // 문자열의 덧셈 연산은 문자열이 아닌 타입이 문자열로 변환 후 실행
    String result = name + 8;

    Integer i = 7;
    // 빈 문자열과의 덧셈연산을 통해 간단한 형변환 가능
    String changeType = i + "";
    System.out.println(result);
    System.out.println(i.getClass().getSimpleName());
    System.out.println(changeType.getClass().getSimpleName());

    System.out.printf("age:%d", i);
  }
}
