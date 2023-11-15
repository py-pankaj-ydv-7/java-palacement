import java.util.*;

public class basic_questions_practice {

    public static void main(String args[]) {

        // //1. Write a program to print whether a number is even or odd, also take
        // input from the user
        Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();

        // if(n%2==0){
        // System.out.println("even number ");
        // }
        // else{
        // System.out.println("odd number ");
        // }

    //     2. Take name as input and print a greeting message for that particular name.

        // char c ='"';
        // System.out.println("enter a name ");
        // String name =sc.nextLine();
        // System.out.println("Greeting ("+c+name+c+")"+c+"Hello"+c+name+c+"!"+c);


           String name=sc.nextLine();
           System.out.println("Hello Good morning "+name+" i hope you have a great day so enjoy it");


    //     3. Write a program to input principal, time, and rate (P, T, R) from the user
    //     and find Simple Interest
        // System.out.println("enter a p");
        // // int p=sc.nextInt();
        // int p =67;
        // System.out.println("enter r ");
        // // int r=sc.nextInt();
        // int r =7;
        // System.out.println("enter a t ");
        // // int t=sc.nextInt();
        // int t=10;
        // float Si = p*r*t/100f;
        // System.out.println("simple interest "+Si);

    //     4. Take in two number and numbers and operater (+,-,*,/) and calculate the
    //     value .(use of conditions )

    //     while(true){
    //     System.out.println("enter a operator ");
    //     char op =sc.next().trim().charAt(0);
    //     System.out.println("enter a number ");
    //     int a=sc.nextInt();
    //     System.out.println("enter a number ");
    //     int b = sc.nextInt();

    //     int ans = 0;
    //     if(op =='+'||op=='-'||op =='*'|| op == '/'|| op == 'x'|| op == 'X'){
    //     if(op=='+'){
    //     ans =a+b;
    //     }
    //     else if(op == '-')
    //     {
    //     ans =a-b;
    //     }
    //     else if(op == '*')
    //     {
    //     ans =a*b;
    //     }
    //     else if (op == '/')
    //     {
    //     ans =a/b;
    //     }
    //     else if (op == 'x' || op == 'X'){
    //     break;
    //     }
    //     else{
    //     System.out.println("invalid value");
    //     }
    //     }
    //     System.out.println("ans is "+ans);

    //     }

    //     5. Take 2 numbers as input and print the largest number.
    //     System.out.println("enter a number ");
    //     int a=sc.nextInt();
    //     System.out.println("enter a number ");
    //     int b=sc.nextInt();
    //     if(a>b){
    //     System.out.println(a + " is the largest no.");
    //     }
    //     else{
    //     System.out.println(b+ " is the largest no.");
    //     }

    //     6. Input currency in rupees and output in USD.
    //     System.out.println("enter a india currency ");
    //     int rupees =sc.nextInt();
    //     double usd = 82.10;
    //     System.out.println(rupees/usd);

    //     7. To calculate Fibonacci Series up to n numbers.
    //     int a=0;
    //     int b=1;
    //     System.out.println("enter a n ");
    //     int n=sc.nextInt();
    //     int i=2;
    //     while(i<=n){
    //         int temp =b;
    //             b=b+a;
    //             a =temp;
    //             i++;
    //         System.out.println(b);    
    //     };
        
    //    8. To find out whether the given String is Palindrome or not
    //    System.out.println("enter a number ");
    //    int n=sc.nextInt();
    //    System.out.println("entet a same number ");
    //    int temp=sc.nextInt();
    //     int rev=0;
    //    while(n!=0){
    //    int rem =n%10;
    //     rev=(rev*10)+rem;
    //     n=n/10;
    //    }
    //    System.out.println("rev "+rev);
    //    if(rev==temp){
    //     System.out.println(" number is palimdrome ");
    //    }
    //    else{
    //     System.out.println("number is not palimdrome ");
    //    }

    // 10. To find Armstrong Number between two given number.
    // System.out.println("enter a number ");
    // int n=sc.nextInt();
    // System.out.println("enter a same number ");
    // int temp = sc.nextInt();
    //  int arm = 0;
    // while(n!=0){
    //     int rem=n%10;
       
    //    arm = arm+(rem*rem*rem);
    //    n=n/10;
    // }
    // System.out.println("armstrong number "+arm);
    // if(arm==temp){
    //     System.out.println("armstrong number ");
    // }
    // else{
    //     System.out.println("n is not armstrong number ");
    // }

     }

}