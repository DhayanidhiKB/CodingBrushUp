package Numbers;

public class EvenAndOddCount {

    public static void main(String [] args){

        int num=123456;

        int evenCount=0;
        int oddCount=0;

        while(num>0){
            int remainder=num%10;
            if(remainder%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
           num= num/10;
        }
        System.out.println("Even numbers is "+evenCount);
        System.out.println("Odd numbers is "+oddCount);
    }
}
