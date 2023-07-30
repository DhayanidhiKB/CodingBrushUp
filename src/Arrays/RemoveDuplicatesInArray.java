package Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesInArray {

    public static void main(String[] args) {

        //Using Streams 1.Using for in streams
        List<Integer> duplicatenumbers= Arrays.asList(1,2,8,8,4,5,5,4,3,3,2,1);
        duplicatenumbers.stream().sorted().distinct().forEach(s->System.out.println(s));

        //Using streams 2.collections in streams
       List<Integer> collection=duplicatenumbers.stream().distinct().collect(Collectors.toList());
      // System.out.println("Duplicates removed using stream collections "+collection);

       //Using LinkedHashSet
        LinkedHashSet<Integer> duplicates=new LinkedHashSet<Integer>(duplicatenumbers);
       // System.out.println("Removed duplicates using LinkedHashSet "+duplicates);
    }
}
