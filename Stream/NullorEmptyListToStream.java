package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NullorEmptyListToStream {

  public static void main(String[] args) {
    List<String> list1 = new ArrayList<>();
    List<String> list2 = null;

    System.out.println(
        Optional.ofNullable(list1).orElse(new ArrayList<>(Arrays.asList("hello"))).stream().map(item -> item.toString())
            .collect(
                Collectors.toList()));

    System.out.println(
        Optional.ofNullable(list2).orElse(new ArrayList<>(Arrays.asList("hello"))).stream().map(item -> item.toString())
            .collect(
                Collectors.toList()));
  }
}
