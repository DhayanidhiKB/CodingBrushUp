package Arrays;

public class LinearSearchInArray {

    public static void main(String[] args){
         int a[]={10,20,30,40,50};
         int searchele=50;
         boolean flag=false;

         for(int i=0;i<a.length;i++){
             if(searchele==a[i]) {
                 System.out.println("Value is found at Index " + i);
                 flag = true;
                 break;
             }
             }
         if(flag==false){
             System.out.println("Value is not found");
         }



    }
}
