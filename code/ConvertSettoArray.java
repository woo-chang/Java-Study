package Lab.code;

import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertSettoArray {

  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);

    Integer[] array = set.toArray(new Integer[set.size()]);
    Stream.of(array).forEach(a -> System.out.println(a));

    array[2] = 1;

    Set<Integer> set1 = Stream.of(array).collect(Collectors.toSet());
    System.out.println(set1);
  }
}
