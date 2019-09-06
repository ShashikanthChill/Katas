public class Vowesl {

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (char ch : str.toCharArray()) {
            switch (ch) {
            case 'a':
                vowelsCount++;
                break;
            case 'e':
                vowelsCount++;
                break;
            case 'i':
                vowelsCount++;
                break;
            case 'o':
                vowelsCount++;
                break;
            case 'u':
                vowelsCount++;
                break;
            default:
                break;
            }
        }
        return vowelsCount;
    }
}