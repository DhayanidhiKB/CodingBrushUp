package Patterns;

public class StarPattern {

    //Star Triangle Pattern
     public static void main(String[] args){
     StarPattern starPattern=new StarPattern();
     starPattern.starPattern();
     starPattern.invertedStarPattern();

     }

     public void starPattern(){
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void invertedStarPattern(){
         for (int i=1;i<=4;i++){
             for (int j=4;j>=i;j--){
                 System.out.print("*");
             }
             System.out.println();

         }
    }
}
