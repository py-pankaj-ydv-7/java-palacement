import java.util.*;
public class calculate_the_value {

    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
         while (true) {
            
        
        System.out.println("enter a value");
        int a = sc.nextInt();
        System.out.println("enter a value");
        int b = sc.nextInt();
        System.out.println("select a operator ");
        char op = sc.next().trim().charAt(0);
        int ans =0;
        if(op == '+' || op == '-' || op == '*' || op == '/'){
            if(op == '+'){
              ans = a+b;
            }
            else if(op == '-'){
                ans = a-b;
            }
            else if(op == '*'){
                ans = a*b;
            }
            else if(op == '/'){
                ans = a/b;
            }
            System.out.println(ans);
        }
        }
    }
}