package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
       List<String> list=new ArrayList<>();
        String lower=str.toLowerCase();
System.out.println(lower);
for(int i=0;i<lower.length();i++) {

    if(Character.isLetter(lower.charAt(i))) {
        str.toLowerCase();
        list.add( lower.substring(0, i) + Character.toUpperCase(lower.charAt(i)) + lower.substring(i+1));
    }

}

String[] stringArr=new String[list.size()];
        return list.toArray(stringArr);
    }
}
