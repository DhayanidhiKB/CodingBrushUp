package Strings;

public class RemoveVowlesFromString {

    public static void main(String[] args){

        String word="aeiouppl";
        String lowerCase=word.toLowerCase();
        char[] c=lowerCase.toCharArray();

        char result1;
        char notVowel;

        for(int i=0;i < c.length;i++){
            if(c[i]=='a'|| c[i]=='e'|| c[i]=='i'||c[i]=='o'||c[i]=='u'){
                result1=c[i];
                //System.out.print("With vowel :"+result1);

            }
            else{
                notVowel=c[i];
                System.out.println("Without vowel :"+notVowel);
            }
        }

    }
}
