package answer3;

public class Test {
    public static void main(String[] args) {
        System.out.println(reverse("input is a blue sky."));
        System.out.println(reverse(null));
        System.out.println(reverse("   "));
        System.out.println(reverse("input   is "));
    }

    public static String reverse(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }
        char[] chars = input.toCharArray();
        StringBuilder result = new StringBuilder();
        String currentWord = "";
        for (int i = chars.length - 1 ; i >= 0 ; i--) {
            char currentChar = chars[i];
            if (currentChar == ' ') {
                if (currentWord.length() > 0) {
                    result.append(currentWord).append(" ");
                }
                currentWord = "";
            } else {
                currentWord = currentChar + currentWord;
            }
        }

        if (currentWord.length() > 0) {
            result.append(currentWord).append(" ");
        }

        return result.length() == 0 ? result.toString() : result.substring(0, result.length() - 1);
    }
}

