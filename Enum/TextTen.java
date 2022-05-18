package Enum;

import java.util.Arrays;
import java.util.List;

public class TextTen {

  public enum PayGroup {
    CASH("현금", Arrays.asList(PayType.ACCOUNT, PayType.PASSBOOK, PayType.MONEY)),
    CARD("카드", Arrays.asList(PayType.TOSS, PayType.NAVER, PayType.KAKAO, PayType.BC));

    private String group;
    private List<PayType> types;

    PayGroup(String group, List<PayType> types) {
      this.group = group;
      this.types = types;
    }

    public List<PayType> getTypes() { return types; }
  }

  public enum PayType {
    ACCOUNT("계좌이체"),
    PASSBOOK("무통장입금"),
    MONEY("현금"),
    TOSS("토스"),
    NAVER("네이버페이"),
    KAKAO("카카오페이"),
    BC("BC결제");

    private String type;

    PayType(String type) {
      this.type = type;
    }
  }

  public static void main(String[] args) {
    for(PayType payType : PayGroup.CARD.getTypes()) {
      System.out.println(payType);
    }
  }
}
