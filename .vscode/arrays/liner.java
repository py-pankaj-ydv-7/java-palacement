import java.util.*;
public class liner {

    public static int ele(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int arr[]={8,6,58,4,65,6};

        int key=sc.nextInt();
      //  ele(arr, key);
        System.out.println(ele(arr, key));
    }
    
}
