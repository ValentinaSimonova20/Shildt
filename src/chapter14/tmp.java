package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class tmp {
    public static void main(String[] args) {
        List<String> songTitles = Arrays.asList("humble", "element", "dna"); Function<String,String> capitalize = str ->str.toUpperCase(); songTitles.stream().map(capitalize).forEach(System.out::println);
    }
}
