package rocks.zipcode.io.quiz3.generics;

import java.util.function.Function;

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
        ArrayUtility<SomeType> utility = new ArrayUtility<>(array);

        return null;
    }




}
