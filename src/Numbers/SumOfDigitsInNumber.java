package Numbers;

public class SumOfDigitsInNumber {

    public static void main(String [] args){

        int num=123455789;
        int sum=0;

        while(num>0){
           sum=sum+num%10;   //num%10 is used to get last digit
           num=num/10;  //num/10 is used to eliminate last digit
        }
        System.out.println("Sum is  "+sum);
    }
}
