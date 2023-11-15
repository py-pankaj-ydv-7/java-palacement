import java.util.*;
public class armstrong {
    public static void main(String args[]){
   
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = sc.nextInt();
        System.out.println("enter a same num for temp number");
        int temp = sc.nextInt();
          int arm =0;
        while (num!=0) {

          
            int rem = num%10;
           arm = arm+(rem*rem*rem); 
            num = num/10;           
        }
        System.err.println("arm number "+arm);
        if(arm == temp){
            System.out.println("num is armstrong ");
        }
        else{
            System.out.println("num is not a armstron ");
        }
    }
    
}
