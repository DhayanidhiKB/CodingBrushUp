package Numbers;

public class ArmstrongNumber {

    public static void main(String [] args){

        int num=153;
        int orgNum=num;

        int n,sum=0;

        while(num>0){
            n=num%10;
            num=num/10;
            sum=sum+n*n*n;
        }
        if(orgNum==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}
