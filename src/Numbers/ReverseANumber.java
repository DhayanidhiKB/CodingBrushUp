package Numbers;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();

        //Using Logic
       int rev=0;

        while (num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reversed number is "+rev);

        //Using StringBuffer
       /* StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();

        System.out.println("Reversed number is "+rev);*/

        //Using StringBuilder

     /*   StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev= sbl.reverse();

        System.out.println("Reversed number is "+rev);*/
    }


}
