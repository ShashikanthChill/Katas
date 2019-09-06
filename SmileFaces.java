import java.util.*;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int smiley_count = arr.stream().mapToInt(t -> {
            int char_count = t.length();
            String[] chars = t.split("");
            switch (char_count) {
            case 2: {
                if ((chars[0].equals(":") || chars[0].equals(";")) && (chars[1].equals(")") || chars[1].equals("D"))) {
                    return 1;
                } else
                    return 0;
            }
            case 3: {
                if ((chars[0].equals(":") || chars[0].equals(";")) && (chars[1].equals("-") || chars[1].equals("~"))
                        && (chars[2].equals(")") || chars[2].equals("D"))) {
                    return 1;
                } else
                    return 0;
            }
            default:
                return 0;
            }
        }).sum();
        return smiley_count;
    }
}