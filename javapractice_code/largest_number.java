import java.util.*;
public class largest_number {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        // find largest number 

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("num1 is largest number ");
        }
        else{
            System.out.println("num2 is largest number ");
        }
    }
    
}
