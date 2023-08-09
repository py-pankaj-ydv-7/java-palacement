import java.util.*;

public class largestelement {

    public static int largestelement(int arr[]){
        int largest = Integer.MIN_VALUE;
           for(int i=0; i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
            // System.out.println(largest);
        
        }
        return largest;
    }
    public static void main(String args[]){

        Scanner sc =new Scanner (System.in);

        int arr[] = {1,2,6,3,5};
        System.out.println(largestelement(arr));

        
    
    }
    
}
