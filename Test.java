import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        // Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();

        // set1.add("e");
        // set1.add("a");
        // set1.add("c");
        // set1.add("d");
        // set1.add("d");
        // set1.add("f");
        // set1.add("z");
        // set1.add("b");

        set2.add("e");
        set2.add("q");
        set2.add("c");
        set2.add("d");
        set2.add("h");
        set2.add("f");
        set2.add("z");
        set2.add("b");

        // System.out.println(set1);
        System.out.println(set2);

        set2.descendingIterator();

    }
}
