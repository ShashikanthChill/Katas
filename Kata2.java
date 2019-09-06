public class Kata2 {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int word_count = 0;
        for (int i = 0; i < words.length; i++) {
            if (word_count == 0) {
                word_count = words[i].length();
                continue;
            }
            if (word_count > words[i].length()) {
                word_count = words[i].length();
            }
        }
        return word_count;
    }
}