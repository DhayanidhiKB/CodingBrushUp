package Arrays;

public class SortArrayInAscendingAndDescendingOrder {

    public static void main(String[] args){

        int arr[]=new int[] {2,4,10,8,11,13,15};
         int temp=0;
         int size=arr.length;

         for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                //if told to sort in descending order then change the greater symbol to arr[j]
                 if (arr[i]<arr[j])  {
                     temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }
             }
         }
        /*System.out.println();
        System.out.println("Elements of sorted array in ascending order ");*/
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
         }
         System.out.println();
        // System.out.println("Second Largest in a array "+arr[size-2]);


         //if you want find second smallest in array..THen sort it to descending order and get size-value
        System.out.println("Second Smallest in a array "+arr[size-2]);
    }
}
