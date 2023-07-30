package Numbers;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String [] args){

        int rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int org_num=num;


        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);

        if(rev==org_num){
          System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not a palindrome ");
        }
    }
}
