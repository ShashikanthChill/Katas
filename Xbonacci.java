import java.util.Arrays;

public class Xbonacci {

    public static double[] tribonacci(double[] s, int n) {
        if (n == 0)
            return new double[] {};
        if (s.length < 3)
            return new double[] {};
        double[] nums = new double[n];
        for (int i = 0; i < s.length; i++) {
            nums[i] = s[i];
        }
        for (int i = 3; i < nums.length; i++) {
            int tmp = i - 1;
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += nums[tmp];
                tmp--;
            }
            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[] { 16.0, 11.0, 15.0 }, 44)));
    }
}