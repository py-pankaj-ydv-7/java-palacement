import java.util.*;

public class function {

  // public static void printhelloworld(){
  // System.out.println("HelloWorld! ");
  // System.out.println("HelloWorld! ");
  // System.out.println("HelloWorld! ");
  // System.out.println("HelloWorld! ");
  // System.out.println("HelloWorld! ");
  // System.out.println("HelloWorld! ");
  // return ;
  // }

  // public static int sumcalculate (int num1, int num2){// formal parameters ,
  // normal parameters .

  // int sum = num1+ num2;
  // return sum ;
  // }
  // public static int changeA (int a){
  // a=10;
  // return a;
  // }

  // public static int multiply(int a, int b){
  // int product = a*b;
  // return product;
  // }

  // public static int factorial(int n){

  // int factorial=1;
  // int i=1;
  // while(i<=n){
  // factorial=factorial*i;
  // i++;
  // }
  // return factorial;

  // }

  // public static int BinoCoeff(int n , int r){
  // int n_fact=factorial(n);
  // int r_fact=factorial(r);
  // int nmr_fact=factorial(n-r);
  // int BinoCoeff=n_fact/(r_fact*nmr_fact);
  // return BinoCoeff;

  // }

  // prime or not

  public static boolean isprime(int n){
  boolean isprime =true;
  for(int i=2;i<n-1;i++){
  if(n%i==0){
  isprime=false;
  }
  }
  return isprime;
  }

  //***************************************/print all prime in a range 2 se 10  *******************************************/

   public static void primesinrange(int n){
    for(int i = 2;i<=n;i++){
     
    if(isprime(i)){
      System.out.print(i+" ");
    }
      
      //System.out.println();
    }

    
   }

  // binary to decimal **************************************************

  // public static void btd(int binNum){
  // int pow = 0;
  // int decNum= 0;

  // while(binNum>0){
  // int lastdigit =binNum%10;
  // decNum = decNum+(lastdigit*(int)Math.pow(2,pow));
  // pow++;

  // binNum=binNum/10;

  // }
  // System.out.println("decimal of " +binNum+" = "+decNum);
  // }

  // *********************************** decimal to binary
  // *****************************************/

  // public static void dectobin(int n){
  // int pow = 0;
  // int myNUM=n;
  // int binNum = 0;

  // while(n>0){
  // int rem = n%2;
  // binNum = binNum+(rem*(int)Math.pow(10,pow));
  // pow++;
  // n=n/2;
  // }
  // System.out.println(" binary form of "+ myNUM+" = "+binNum);
  // }

  // call by value (in java)

  // public static void swap(int a, int b) {

  //   int temp = a;
  //   a = b;
  //   b = temp;

  //   System.out.println("a = " + a);
  //   System.out.println("b = " + b);
  // }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("enter a number ");
    // int dectobin=sc.nextInt();
    // dectobin(dectobin);
    // int binnum=sc.nextInt();
    // btd(binnum);
    // printhelloworld();
    // int a =sc.nextInt();
    // int b =sc.nextInt();

    // int sum= sumcalculate(a,b); // actual parameters , arguments
    // System.out.println(sum);

    // int a=5;
    // changeA(a);
    // System.out.println("changeA "+changeA(a));
    // System.out.println(a);

    // int a=5;
    // int b=3;
    // int prod = multiply(a, b);
    // System.out.println(prod);
    // prod = multiply(10, 20);
    // System.out.println(prod);

    // System.out.println("enter a value ");
    // int n=sc.nextInt();
    // int facto = factorial(n);
    // System.out.println(facto);
    // int n=5;
    // int r=2;
    // System.out.println("ncr "+BinoCoeff(n, r));
    // System.out.println(isprime(4));

    // call by value (in java)
    // swap

    // int a = 5;
    // int b = 10;

    // swap(a, b);
    //prims in ranges 
    primesinrange(20);

  }

}
