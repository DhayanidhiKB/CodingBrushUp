package Arrays;

public class FindMissingNumberInArray {

    public static void main(String[] args){

        int a[]={1,2,4,5,6};

        int sum=0;

        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of elements in array is "+sum);

        int sum2=0;

        for(int i=0;i<=6;i++){
            sum2=sum2+i;
        }
        System.out.println("Sum of elements in array is "+sum2);

        System.out.println("Missing number in array is "+(sum2-sum));
    }
}
