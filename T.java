public class T {
    public static void main(String[] args) {
        String s = "#Jay @Shr&ee $Ram";
        int Count = 0;
        String RemoveSpecialChar = "";
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))
                    && !Character.isLetter(s.charAt(i))) {
                Count++;
            } else {
                RemoveSpecialChar = RemoveSpecialChar + s.charAt(i);
            }

        }
        System.out.println("Aftter Remove Special Char : " +RemoveSpecialChar);
        System.out.println("Number of Special Char : " +Count);
    }
}
