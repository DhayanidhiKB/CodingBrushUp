package Arrays;

public class FindMaxMinDiff {

    public static void main(String[] args){
        int [] arr = {10,90,2,40,1,25,-1};
         int max=arr[5];
         int min=arr[5];

         for(int i=0 ;i<arr.length;i++){
             if(arr[i]>max){
                 max=arr[i];
             }
             else if(arr[i]<min){

                 min=arr[i];
             }
         }
         System.out.println("The maximum number in an array is " +max);
         System.out.println("The minimum number in an array is " +min);
         System.out.println("The diff between max and min in array is "+(max-min));
    }
}
