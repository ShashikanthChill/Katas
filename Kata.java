public class Kata {
  public static String HighAndLow(String numbers) {
    String[] nums = numbers.split(" ");
    String high = null, low = null;
    for (int i = 0; i < nums.length; i++) {
      if (high == null && low == null) {
        high = nums[i];
        low = nums[i];
        continue;
      }

      if (Integer.parseInt(nums[i]) > Integer.parseInt(high)) {
        high = nums[i];
        continue;
      }

      if (Integer.parseInt(nums[i]) < Integer.parseInt(low)) {
        low = nums[i];
        continue;
      }

    }
    return high + " " + low;
  }

  public static void main(String[] args) {
    System.out.println(HighAndLow("97 -5 -2 6 9 115 2 3 6 11 4"));
  }
}