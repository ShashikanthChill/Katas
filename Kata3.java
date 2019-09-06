import java.util.ArrayList;
import java.util.List;

public class Kata3 {
    public static int TripleDouble(long num1, long num2) {
        String s1 = Long.toString(num1);
        String s2 = Long.toString(num2);

        List<String> triples = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            try {
                String substring = s1.substring(i, i + 3);
                if (isTriple(substring))
                    triples.add(substring);
            } catch (StringIndexOutOfBoundsException sioobe) {
                break;
            }
        }
        for (String s : triples) {
            if (s2.contains(s.substring(0, 2)))
                return 1;
        }
        return 0;
    }

    private static boolean isTriple(String substring) {
        char tmp = substring.charAt(0);
        boolean isTriple = false;
        for (int i = 0; i < substring.length(); i++) {
            if (tmp == substring.charAt(i)) {
                isTriple = true;
            } else {
                isTriple = false;
                break;
            }
        }
        return isTriple;
    }
}