import java.util.*;
public class fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = 0;
        int b = 1;
        System.out.println("enter a number ");
        int n = sc.nextInt();

        for(int i = 2; i<n; i++){
            int temp = b;
            b =b+a;
            a = temp;
            System.out.println(b);
        }
      
    }
}
