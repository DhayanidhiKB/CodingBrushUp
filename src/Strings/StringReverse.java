package Strings;

public class StringReverse {

    public static void main(String [] args){
        String s="selenium";
     //   String s1= s.substring(0,1).toUpperCase()+s.substring(0);
       // System.out.println(s1);
        String rev="";

        //Using standard method
       for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.print(rev);

        //Using stringBuffer
       /* StringBuffer sb=new StringBuffer(s);
        StringBuffer reversed=sb.reverse();
        System.out.println(reversed);*/
    }
}
