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

        int arr[]={23,44,55,66,77};

        int maximum=arr[0];
        int minimum=arr[0];

        for(int i=1;i<arr.length;i++){
         if(arr[i]>maximum)   {
             maximum=arr[i];
         }
        }
        System.out.println("Max number in array "+maximum);

        for(int j=1;j<arr.length;j++){
            if(arr[j]<minimum)   {
                minimum=arr[j];
            }
        }
        System.out.println("Min number in array "+minimum);
    }
}
