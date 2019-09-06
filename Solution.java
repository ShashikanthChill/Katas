public class Solution {

    public static String camelCase(String str) {
        if (str.trim().length() == 0)
            return "";
        String[] words = str.trim().split(" ");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String s : words) {
            sb2.append(s.trim());
            if (s.length() == 0)
                continue;
            sb2.setCharAt(0, Character.toUpperCase(sb2.charAt(0)));
            sb1.append(sb2);
            sb2.setLength(0);
        }
        return sb1.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("shashi is a good boy"));
    }
}
