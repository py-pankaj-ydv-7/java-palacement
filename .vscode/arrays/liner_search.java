import java.util.*;

public class liner_search {

    public static int linerSearch(int num[], int key){
        for(int i=0;i<=num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){

        Scanner sc =new Scanner (System.in);

        int arr[]={1,2,3,5,8,9,6,4};
        System.out.println("enter a key ");
        int key=sc.nextInt();
        System.out.println("key = "+key+"  " +linerSearch(arr, key));

        
    }
}