public class OddPositionCharacters {
    public static void main(String[] args) {
        String text = "type here to search";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar != ' ' && i % 2 == 0) {
                result.append(currentChar);
            }
        }

        System.out.println("Odd-positioned characters (ignoring white space): " + result.toString());
    }
}
