import java.util.*;

public class given_string_plimdron {

    public static void main(String args[]){
    
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a number ");
        int num =sc.nextInt();
        int rev =0;
        System.out.println("enter a same number ");
        int temp =sc.nextInt();
        while(num!=0) {
            
            int rem = num%10;
            rev = (rev*10)+rem;
            num=num/10;

        }
        System.out.println("Reverse number "+rev);
        if(temp == rev){
            System.out.println("number is palimdrone ");
        }
        else{
            System.out.println("num is not plimdrone");
        }


    }
    
}
