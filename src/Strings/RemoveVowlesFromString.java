package Strings;

public class RemoveVowlesFromString {

    public static void main(String[] args){

        String word="Java program";
        String lowerCase=word.toLowerCase();
        char[] c=lowerCase.toCharArray();

        char result1;
        char notVowel;

        for(int i=0;i < c.length;i++){
            if(c[i]=='a'|| c[i]=='e'|| c[i]=='i'||c[i]=='o'||c[i]=='u'){
                result1=c[i];

                //with vowel
                //System.out.print(result1);

            }
            else{
                notVowel=c[i];
                //Without vowel
                System.out.print(notVowel);
            }
        }

    }
}
//if you want to print string with vowel print if block
//if you want to print string without vowel print else block