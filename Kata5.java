public class Kata5 {

    public static String encrypt(final String text, final int n) {
        if (n <= 0 || text.isEmpty() || text == null)
            return text;

        StringBuilder finalString = new StringBuilder(text);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int j = 0; j < n; j++) {

            sb1.setLength(0);
            sb2.setLength(0);

            char[] chars = finalString.toString().toCharArray();

            for (int i = 1; i < chars.length; i += 2) {
                sb1.append(chars[i]);
            }
            for (int i = 0; i < chars.length; i += 2) {
                sb2.append(chars[i]);
            }
            finalString.setLength(0);
            finalString.append(sb1.append(sb2));
        }

        return finalString.toString();
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (n <= 0 || encryptedText.isEmpty() || encryptedText == null)
            return encryptedText;

        int div = encryptedText.length() / 2;
        StringBuilder sb = new StringBuilder(encryptedText);

        for (int j = 0; j < n; j++) {
            char[] firstHalfChars = sb.substring(0, div).toCharArray();
            char[] secondHalfChars = sb.substring(div).toCharArray();
            try {
                sb.setLength(0);
                for (int i = 0; i < ((firstHalfChars.length - secondHalfChars.length) >= 0 ? firstHalfChars.length
                        : secondHalfChars.length); i++) {
                    sb.append(secondHalfChars[i]);
                    sb.append(firstHalfChars[i]);
                }
            } catch (ArrayIndexOutOfBoundsException sioobe) {
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(encrypt("Shashi!", 2));
        System.out.println(decrypt("sShhia!", 2));
    }

}