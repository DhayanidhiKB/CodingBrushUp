package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfElementsInArray {

    public static void main(String[] args){

       int array[]={5,2,3,7,8};
       int sum = 0;

    /*   //Using for Loop
       for (int i=0;i<array.length;i++){
         sum=sum+array[i];
       }
       System.out.println("Sum of elements in array from for Loop "+sum);*/

       //Using forEach Loop
        for(int i:array){
            sum=sum+i;
        }
        System.out.println("Sum of elements in array from for Each Loop "+sum);

        //using streams
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum1=integers.stream()
                .reduce( (a, b) -> a + b);

        System.out.println("The sum of all elements of numbers array " + sum1.get());
    }
}
