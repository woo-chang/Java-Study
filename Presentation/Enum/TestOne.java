package Presentation.Enum;

public class TestOne {

  public static void main(String[] args) {
    String ipAddr1 = MyConstant.IP_ADDRESS_ONE.toString();
    String ipAddr2 = MyConstant.IP_ADDRESS_TWO.toString();

    System.out.println("ipAddr1 = " + ipAddr1);
    System.out.println("ipAddr2 = " + ipAddr2);

    System.out.println(MyConstant.BASIC_LEVEL_ONE == MyConstant.HARD_LEVEL_ONE);

    System.out.println(MyConstant.BASIC_LEVEL_ONE);
  }
}

