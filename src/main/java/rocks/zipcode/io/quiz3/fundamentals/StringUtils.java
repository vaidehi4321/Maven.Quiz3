package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder s= new StringBuilder();
        for(int i=0;i<indexToCapitalize-1;i++) {
            s.append(str.charAt(i));
        }

            s.append(Character.toUpperCase(str.charAt(indexToCapitalize)));

        for(int i=indexToCapitalize+1;i<str.length();i++) {
            s.append(str.charAt(i));
        }
        return s.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return null;
    }

    public static String[] getAllSubStrings(String string) {
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
