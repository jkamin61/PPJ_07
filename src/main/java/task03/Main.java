package task03;

public class Main {
    public static void main(String[] args) {
        char[][] tab = {
                {'S', 'a', 'm', 's', 'u', 'n', 'g'},
                {'N', 'o', 'k', 'i', 'a'},
                {'A', 'p', 'p', 'l', 'e'},
                {'B', 'l', 'a', 'c', 'k', 'b', 'e', 'r', 'r', 'y'},
                {'A', 'l', 'c', 'a', 't', 'e', 'l'},
                {'S', 'o', 'n', 'y'},
                {'J', 'o', 'l', 'l', 'a'}
        };
        for (char[] word : tab) {
            if (hasRepeatedCharacters(word) &&
                    sumOfCharacters(word) > 255 &&
                    containsCharacter(word, 'i')) {
                System.out.println(word);
            }
        }
    }

    private static boolean hasRepeatedCharacters(char[] word) {
        for (int i = 0; i < word.length; i++) {
            char current = Character.toLowerCase(word[i]);
            for (int j = i + 1; j < word.length; j++) {
                if (Character.toLowerCase(word[j]) == current) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int sumOfCharacters(char[] word) {
        int sum = 0;
        for (char c : word) {
            sum += c;
        }
        return sum;
    }

    private static boolean containsCharacter(char[] word, char c) {
        for (char letter : word) {
            if (Character.toLowerCase(letter) == Character.toLowerCase(c)) {
                return true;
            }
        }
        return false;

    }
}
