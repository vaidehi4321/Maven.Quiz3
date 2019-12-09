package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder s= new StringBuilder();
        for(int i=0;i<indexToCapitalize;i++) {
            s.append(str.charAt(i));
        }

            s.append(Character.toUpperCase(str.charAt(indexToCapitalize)));

        for(int i=indexToCapitalize+1;i<str.length();i++) {
            s.append(str.charAt(i));
        }
        return s.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        //if(baseString.charAt(indexOfString)==characterToCheckFor)
        return (baseString.charAt(indexOfString)==characterToCheckFor);
    }

    public static String[] getAllSubStrings(String string) {
        List<String>al=new ArrayList<>();
        for(int i=0;i<string.length();i++){
         for(int j=i+1;j<=string.length();j++){

             al.add(string.substring(i,j));
         }
        }
        for(int i = 0 ;i<al.size()-1; i++){
            for(int j=i+1;j<al.size();j++){
                if(al.get(i).equals(al.get(j)))
                    al.remove(al.get(i));

            }
        }

        String[]substr=new String[al.size()];
        al.toArray(substr);
        return substr;
    }

    public static Integer getNumberOfSubStrings(String input){
        String[] substr=getAllSubStrings(input);
        return substr.length;
    }
}
