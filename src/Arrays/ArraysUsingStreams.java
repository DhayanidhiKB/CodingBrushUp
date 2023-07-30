package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysUsingStreams {

    public static void main(String[] args){

        //Print in lowerCase using streams
       /* List<String> vehicles=Arrays.asList("Bike","Car","Bus","Plane");
        vehicles.stream().map(s->s.toLowerCase()).forEach(s->System.out.println(s));*/

        //To find average of array using streams
        List<Integer> numbers= Arrays.asList(1,1,2,3,2,4,8,6,5,4,5,6,7,8,9,22,222,243,244);
       // Double averageValue=numbers.stream().mapToInt(e->e).average().getAsDouble();
        //System.out.println(averageValue);

        //To find square and add filter to an array
        //numbers.stream().map(s->s*s).filter(s->s>30).forEach(s->System.out.println(s));

        //FindOdd and Even numbers in array
        //numbers.stream().filter(s->s%2==0).forEach(s->System.out.println("Even numbers in array is "+s));
        //numbers.stream().filter(s->s%2!=0).forEach(s->System.out.println("Odd numbers in array is "+s));

        //Filter number starting with 2 from array
        //List<Integer> numbersstartingwithTwo=numbers.stream().map(s->String.valueOf(s)).filter(s->s.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
        //System.out.println(numbersstartingwithTwo);

        //Remove Duplicates in array
        List <Integer> withoutdup=numbers.stream().distinct().sorted().collect(Collectors.toList());
        //System.out.println(withoutdup);

        //Find duplicates in array
        List<Integer> duplicatesInArray=numbers.stream().filter(s-> Collections.frequency(numbers,s)>1).collect(Collectors.toList());
        //System.out.println(duplicatesInArray);

        //Find max and min in array
        int max=numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
        //System.out.println(max);


        int min=numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
        //System.out.println(min);

        //Sort in Ascending and descending order
       /* List<Integer> ascending=numbers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(ascending);

        List<Integer> descending=numbers.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(descending);*/

        //Get first 5 values from array and sum of first 5 values
     /*   List<Integer> firstFiveValues=numbers.stream().limit(5).collect(Collectors.toList());
        System.out.println(firstFiveValues);

        int sumofFiveElements=numbers.stream().limit(5).reduce((a,b)->a+b).get();
        System.out.println(sumofFiveElements);*/

        //Skip first 5 values and get remaining values and sum of it
       /* List<Integer> skippedfirstFiveValues=numbers.stream().skip(5).collect(Collectors.toList());
        System.out.println(skippedfirstFiveValues);

        int sumofFiveElements =numbers.stream().skip(5).reduce((a,b)->a+b).get();
        System.out.println(sumofFiveElements);*/


        //Get second Highest and Second lowest from array
        int secondLowest=numbers.stream().distinct().sorted().skip(1).findFirst().get();
        System.out.println(secondLowest);

        int secondHighest=numbers.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighest);
    }

}
