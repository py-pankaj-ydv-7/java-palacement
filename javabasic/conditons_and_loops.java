import java.util.*;

public class conditons_and_loops {
   public static void main(String args[]) {
      /*
       * syntax of if statements:
       * if (boolean expression T or F){
       * // body
       * }
       * else (
       * //print this
       * )
       * 
       */

      // int salary = 25000;
      // if(salary>=10000){
      // salary=salary+2000;
      // }
      // else {
      // salary=salary+1000;
      // }
      // System.out.println(salary);

      // ********************** multiple conditons ********************************* .

      Scanner sc = new Scanner(System.in);

      // int salary = sc.nextInt();
      // if(salary>10000){
      // salary+=2000;
      // }
      // else if(salary>20000){
      // salary+=3000;
      // }
      // else{
      // salary+=1000;
      // }

      // System.out.println(salary);

      /******************** loops ******************************/

      // int n=sc.nextInt();

      // for (int i= 1;i<=n;i++){
      // // System.out.println(i+" ");
      // System.out.print("hello world ");
      // }

      // while loop

      /*
       * whiel(conditon){
       * // body
       * updation
       * }
       * 
       * 
       */

      // print 1 to five
      // int i = 1;
      // while(i<=5){
      // System.out.println(i);
      // i++;
      // }

      // do whiel syntax
      /*
       * do{
       * //body
       * } while(conditions)
       * 
       */

      // print 1 to five
      // int i= 1;

      // do{
      // System.out.println(i);
      // i++;
      // }while(i<=5);

      /***************** practice questions ********************/
      // find the largest number among these three numbers .
      // int a = sc.nextInt();
      // int b = sc.nextInt();
      // int c = sc.nextInt();

      // int max =a;
      // if(b>max){
      // max = b;
      // }
      // if(c>max){
      // max=c;
      // }
      // System.out.println(max);

      /* fibonacci series */
      // int n=sc.nextInt();
      // int a = 0;
      // int b = 1;
      // int count=2;

      // while(count<=n){
      // int temp = b;
      // b= b+a;
      // a = temp;
      // count++;
      // }
      // System.out.println(b);

      // n=1385757879 find how many times 7 is occur.
      // int count=0;
      // int n=1385757879;
      // for(int i=1;i<=n;i++){
      // int rem=n%10;

      // if(rem==7){
      // count+=1;
      // }
      // n=n/10;
      // }
      // System.out.println(count);

      // reverse a number

      // int n = 235644;
      // int rev =0;
      // while(n>0){

      // int rem = n%10;
      // rev = (rev*10)+rem;
      // n=n/10;
      // }
      // System.out.println(rev);

      // calculator

      // int ans = 0;
      // while (true) {

      //    System.out.println("enter a operator ");
      //    char op = sc.next().trim().charAt(0);
      //    if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
      //    System.out.println();
      //    System.out.println("enter a num 1 ");
      //    int num1 = sc.nextInt();
      //    System.out.println("enter a num 2 ");
      //    int num2 = sc.nextInt();

      //    if (op == '+') {
      //       ans = num1 + num2;
      //    }

      //    if (op == '-') {
      //       ans = num1 - num2;
      //    }

      //    if (op == '*') {
      //       ans = num1 * num2;
      //    }

      //    if (op == '/') {
      //       if (num2 != 0) {
      //          ans = num1 / num2;
      //       }
      //    }

      //    if (op == '%') {
      //       ans = num1 % num2;
      //    } }else if (op == 'x' || op == 'X') {
      //       break;
      //    }
      //    else {
      //       System.out.println(" invalid operator ");
      //    }
      //    System.out.println(ans);      
      // }

      //* print largest number */
      // int a = 1;
      // int b = 5;

      // if(a>b){
      //    System.out.println(a);
      // }
      // else{
      //    System.out.println(b);
      // }

      // find  odd or even 
      // int n = sc.nextInt();
      // if(n%2==0){
      //    System.out.println("even number "+n);
      // }
      // else {
      //    System.out.println("odd number "+n);
      // }

      //icome tax calculator
      /*
       income <5l to tax = 0, income >=5l && <=10lto tax to tax = 20%, income >=10l t0 tax =30%
       */
      
      // System.out.println("enter your salary ");
      //  int salary=sc.nextInt();
      //  int tax;
      //  if(salary<=500000){
      //     tax =0;
      //  }

      //  else if(salary>=500000 && salary<=100000){
      //    tax = (int) ((int) salary*0.2);
      //  }
      //  else{
      //    tax = (int ) (salary*0.3);
      //  }
      //  System.out.println(tax);

   //print largest number among three
   // int a =sc.nextInt();
   // int b = sc.nextInt();
   // int c= sc.nextInt();

   // if(a>b&&a>c){
   //    System.out.println(a);
   // }
   // else if(b>a&&b>c){
   //    System.out.println(b);
   // }
   // else{
   //    System.out.println(c);
   // }

   /*********** ternary operator*******/
// int a=5,b=3;
// int larger = (a>b)?a:b;
// System.out.println(larger);
// int number = 5;
// String type=((number%2)==0)?  " even ":  "odd";
// System.out.println(type);

///************************************ switch *********************/
  
   //  int number =2;
   //  switch(number){
   //    case 1:
   //    System.out.println("1");
   //    break;
   //    case 2:
   //    System.out.println("2");
   //    break;
   //    case 3:
   //    System.out.println("3");
   //    break;

   //    default:
   //    System.out.println("chutiya banaya tumko ");
   //  }


   /*********** calculator with the help of switch ***********/
//    int a=sc.nextInt();
//    int b=sc.nextInt();
// System.out.println("enter a operator");
//    char operator =sc.next().charAt(0);

//    switch(operator){
//       case '+': System.out.println(a+b);
//       break;
//       case '-': System.out.println(a-b);
//       break;
//       case '*': System.out.println(a*b);
//       break;
//       case '/': System.out.println(a/b);
//       break;
//       case '%': System.out.println(a%b);
//       default:System.out.println("fir se chutiya banaya tumko");
//    }


/*questions practice  */
// write a java program to get a number from the user and print whether it is positive or negative

// int n=sc.nextInt();
// if(n>0){
//    System.out.println("positive number ");
// }

// else if (n==0){
//    System.out.println("number is zero ");
// }
// else{
//    System.out.println("number is negative");
// }


   // // q.2
   // double temp =103.5;
   // if(temp>100){
   //    System.out.println("you have a feaver ");
   // }
   // else{
   //    System.out.println("you dont have feaver");
   // }

   //Q.3 input week number (1-7) and print day of week name using switch case .

   // int week =sc.nextInt();

   // switch(week){
   //    case 1: System.out.println("monday");
   //    break;
   
   //    case 2: System.out.println("tuesday");
   //    break;

   //    case 3: System.out.println("wednesday");
   //    break;

   //    case 4: System.out.println("thusday");
   //    break;
   
   //    case 5: System.out.println("friday");
   //    break;
   //    case 6: System.out.println("saturday maje kar bsdk");
   //    break;
   //    case 7: System.out.println("sunday maje kar bsdk");
   //    break;
   //    default:
   //       System.out.println("chutiye sahi number daal ");
   //    }
   
   //what will be the value of x & y in the following program 
   // int a=63,b=36;

   // boolean x =(a<b) ? true: false;
   // System.out.println(x);
   // int y =(a>b)? a:b;
   // System.out.println(y);


   //Q.5 take a year from the user and print whether that year is a leap year or not 
   
   // System.out.println("Enter a year ");
   // int year = sc.nextInt();

   // if(year%4==0){
   //    if(year%100==0){
   //       if(year%400==0){
   //          System.out.println("leap year ");
   //       }
   //       else{
   //          System.out.println("not leap year");
   //       }
   //    }
   //    else{
   //       System.out.println("leap year");
   //    }
   // }
   // else{
   //    System.out.println("not a leap year ");
   // }

   //********************apna college k loops****************/

   //print 1 to 10;
   // int i = 1;
   // while(i<=10){
   //    System.out.println(i);
   //    i++;
   // }

   //print 1 to n
   // int i =1;
   // int n=sc.nextInt();
   // while(i<=n){
   //    System.out.println(i);
   //    i++;
   // }

   //sum of first n natural number .
   // int n=sc.nextInt();
   // int i=1;
   // int sum = 0;
   // while(i<=n){
   //    sum=sum+i;
   //    i++;
   //    System.out.println(sum);
   // }
   // System.out.println();
   // System.out.println(sum);

   // print sqr pattern by using for loop
   // int sqr=sc.nextInt();
   // for(int i=1;i<sqr;i++){
   //    System.out.println("* * * *");
   // }

   //print reverse of number 
   // int rev=0;
   // int num=12345;
   // for(;0<num;){
      
   //    int rem=num%10;
   //    rev=(10*rev)+rem;
   //    num=num/10;
   // }
   // System.out.println(rev);
   // int rev=0;
   // int n=12345;
   // while(n>0){
      
   //    int rem=n%10;
   //    rev=(10*rev)+rem;
   //    n=n/10;

   // }
   // System.out.println(rev);

   // check if a number is prime 
   // int n=sc.nextInt();
   // boolean isprime = true;

   // if(n==2){
   //    System.out.println("n is a prime number");
   // }
   // else{
      
   // for(int i = 2;i<=n-1;i++){
   //    if(n%i==0){
   //       isprime = false;
   //    }
   //     }
   //    if(isprime==true){
   //       System.out.println("n is a prime number ");
   //    }
   //    else{
   //       System.out.println("n is a not prime number ");
   //    }

   // }

   // loop questions practice .............
   
   // hello is printed 2 times.
   // for(int i=1;i<=2;i++){
   //    System.out.println("Hello");
   // }

   
// int number,choice,evensum=0,oddsum=0;
 
// do{
//    System.out.println("Enter the number ");
//    number =sc.nextInt();

//    if(number%2==0){
//       evensum = evensum+number;
//    }else{
//         oddsum = oddsum+number;
//    }

//    System.out.println("so you want to continue? press 1 for yes or 0 for no");
//    choice =sc.nextInt();
// } while(choice==1);

// System.out.println("sum of even number : "+evensum);
// System.out.println("sum of odd number : "+oddsum);

// int num; // to hold number
// int fact =1; // to hold factorial

// System.out.println("enter any positive integer: ");
// num=sc.nextInt();

// for(int i=1;i<=num;i++){
//    fact*=i;
// }
// System.out.println("factorial "+fact);

// System.out.println("enter number: ");
// int n =sc.nextInt();
// for (int i=1;i<=10;i++){
//    System.out.println(n+" * "+i+" = "+ n*i);
// }

}
 }

