package Arrays;

public class CommonElementsInTwoArrays {

    public static void main(String[] args){

        int array1[]={1,2,3,4};
        int array2[]={2,3,4};
        System.out.println("The common elements in array is ");

        for (int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
        //WHen asked to remove first and last element in a array
        for(int k=1;k<array1.length-1;k++){
            System.out.println(array1[k]);
        }
    }
}
