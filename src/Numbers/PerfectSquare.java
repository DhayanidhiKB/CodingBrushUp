package Numbers;

import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int number=sc.nextInt();

        for(int i=0;i<number/2;i++){
            if(i*i==number){
                System.out.println("Given number is square of "+i);
                return;
            }

        }
    }
}
