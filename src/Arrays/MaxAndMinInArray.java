package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinInArray {

    public static void main(String[] args){

        List<Integer> al= Arrays.asList(1,2,3,4,5,6,7,8,9);

        int max=al.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Maximum number is Array is "+max);

        int min=al.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Minimum Number in Array is "+min);
    }
}
