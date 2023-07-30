package Strings;

public class RemoveSpacesInString {

    public static void main(String[] args){

        String s="java   selenium   program";
        String s1 =s.replaceAll("\\s","");
        System.out.println(s1);

    }
}
