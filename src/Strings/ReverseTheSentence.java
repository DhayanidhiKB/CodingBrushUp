package Strings;

public class ReverseTheSentence {

    public static void main(String[] args){

       String str = "Hello I am Praveen";
        String [] strSplit = str.split("\\s"); //  //s means separating it by space

        for(int i=strSplit.length-1; i>=0; i--)
        {
            System.out.print(strSplit[i]+" ");
        }

    }
}
