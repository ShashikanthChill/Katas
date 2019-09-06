import java.util.stream.IntStream;

public class TwoToOne {

    public static String longest(String s1, String s2) {
        IntStream chars = s1.concat(s2).chars();
        StringBuilder sb = new StringBuilder();
        chars.distinct().sorted().forEach(t -> {
            sb.append((char) t);
        });
        return sb.toString();
    }
}