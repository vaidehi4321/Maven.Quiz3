package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;


    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        ArrayUtility<SomeType> utility = new ArrayUtility<>(array);

        for(int i=0;i<array.length;i++) {
            if (getNumberOfOccurrences(array[i]) % 2 != 0)
                return array[i];
        }

        return null;
    }

    public SomeType findEvenOccurringValue() {
        ArrayUtility<SomeType> utility = new ArrayUtility<>(array);

        for(int i=0;i<array.length;i++) {
            if (getNumberOfOccurrences(array[i]) % 2 == 0)
                return array[i];
        }

        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int count = 0;
        for(int i=0;i < array.length; i++){
            if(array[i]==(valueToEvaluate))
            count++;
        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return Arrays.stream(array).filter(predicate::apply).collect(toList()).toArray(Arrays.copyOf(array, 0));


    }




}
