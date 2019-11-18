package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
                return true;
        }


        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        word.toLowerCase();
        int index = 0;
        if (hasVowels(word))
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                        || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    index = i;
                    break;
                }
            }
        else {
            return -1;
        }

        return index;
    }


    public static Boolean startsWithVowel(String word) {

        if (word != null) {
            if (word.toLowerCase().charAt(0) == 'a' || word.toLowerCase().charAt(0) == 'e' || word.toLowerCase().charAt(0) == 'i' || word.toLowerCase().charAt(0) == 'o' || word.toLowerCase().charAt(0) == 'u') {
                return true;
            }

        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        if (character == 'a' || character == 'e' || character == 'o' || character == 'i' || character == 'u')
            return true;
        if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            return true;
        }
        return false;
    }
}