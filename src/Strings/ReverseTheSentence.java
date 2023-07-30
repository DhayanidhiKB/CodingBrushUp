package Strings;

public class ReverseTheSentence {

    public static void main(String[] args){

        String str = "Hello I am Praveen";
        String [] strSplit = str.split("\\s"); //  \\s means separating it by space

        for(int i=strSplit.length-1; i>=0; i--)
        {
            System.out.print(strSplit[i]+" ");
        }

     /*   String str = "Hello-I-am-praveen";
        String word = "";
        String [] split = str.split("-");

        for(int i=0; i<split.length; i++)
        {
            word = split[i];

            System.out.print(word.charAt(0));
        }*/
    }
}
