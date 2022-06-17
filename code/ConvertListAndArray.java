package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertListAndArray {

  public static void main(String[] args) {
    // Array to List
    // 고정 길이의 List가 생성되기에 값 변경은 가능하지만 추가, 삭제는 불가능
    Integer[] arr = {1, 2, 3};
    List<Integer> list1 = Arrays.asList(1, 2, 3);
    List<Integer> list2 = Arrays.asList(arr);
    List<Integer> list4 = Arrays.stream(arr).toList();

    System.out.println(list1);
    System.out.println(list2);

    // list1.add(4);
    list1.set(1, 4);
    // list1.remove(1);
    System.out.println(list1);

    // 가변 길이의 List 생성
    // 추가, 삭제, 변경 가능
    List<Integer> list3 = new ArrayList<>(Arrays.asList(arr));

    System.out.println(list3);

    list3.add(4);
    list3.set(1, 5);
    list3.remove(1);

    System.out.println(list3);

    List<Integer> list5 = Stream.of(arr).collect(Collectors.toList());

    //list4.add(4);
    list5.add(4);

    System.out.println(list4);
    System.out.println(list5);

    System.out.println("----------");

    // Primitive Type
    int[] arr2 = {1, 2, 3};
    List<Integer> list6 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
    System.out.println(list6);

    list6.add(4);

    // List to Array
    // 길이 지정이 필요, 0으로 해도 자동으로 size를 눌려주기 때문에 상관 X
    // Wrapper Class만 가능
    Integer[] array1 = list1.toArray(new Integer[list1.size()]);

    System.out.println(Arrays.toString(array1));

  }

}
