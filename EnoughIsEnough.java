import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> nums = new ArrayList<>();
        for (int var : elements) {
            nums.add(var);
        }
        for (int i = 0; i < nums.size(); i++) {
            int temp = nums.get(i);
            int occurence = 0;
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(j) == temp) {
                    if (!(occurence >= maxOccurrences))
                        ++occurence;
                    else {
                        nums.remove(j);
                        i = -1;
                    }
                }
            }
        }
        int[] filteredElements = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            filteredElements[i] = nums.get(i);
        }
        return filteredElements;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteNth(new int[] { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3 }, 2)));
    }
}