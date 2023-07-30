package Strings;

public class StringSplitOperation {

    public static void main(String[] args){
        String passwordText ="Praveen Dhayan-idhi";

        //Please use temporary password 'rahulshettyacademy' to Login.

        String[] passwordArray = passwordText.split(" ");

        // String[] passwordArray2 = passwordArray[1].split("'");

        // passwordArray2[0]

        String password = passwordArray[1].split("'")[0];



        //0th index - Please use temporary password

        //1st index - rahulshettyacademy' to Login.



        //0th index - rahulshettyacademy

        //1st index - to Login.
    }
}
