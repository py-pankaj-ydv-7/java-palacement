import java.util.*;
import java.lang.Math.*;

public class conditons_loop_practicequestions {

    /**
     * @param args
     * 
     */
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        

    //Area of circle java program 
    // int r=sc.nextInt();
    // float pi = 3.14f;
    // int area_of_circle = (int)pi*(r*r);
    // System.out.println("area of circle "+area_of_circle);

    //area of tirangle 
    // int a =sc.nextInt();
    // int b =sc.nextInt();
    // int c =sc.nextInt();

    // int area_of_triangle = a*b*c;
    // System.out.println("area of triangle "+area_of_triangle);
    
    //3.  area of rectangle 

    // int a =sc.nextInt();
    // int b =sc.nextInt();
    // int area_of_rectangle = a*b;
    // System.out.println("area of rectangle "+area_of_rectangle);

    //4. Area Of Isosceles Triangle
     
    // System.out.println("enter a height ");
    // int h =sc.nextInt();
    // System.out.println("enter a base ");
    // int b =sc.nextInt();
    // double  area_of_isosceles_triangle=(1*b*h)/2;
    // System.out.println("isoscales triangle "+area_of_isosceles_triangle);

//5. Area Of Parallelogram

// System.out.println("enter a base ");
// int b=sc.nextInt();
// System.out.println("enter a height ");
// int h =sc.nextInt();

// int area_of_parallelogram= b*h;
// System.out.println("area of parallelogram "+area_of_parallelogram);

// 6. area of rombus 
// System.out.println("enter a diagonal");
// int d1 =sc.nextInt();
// System.out.println("enter a diagonal");
// int d2 = sc.nextInt();

// double area_of_rombus=(d1*d2)/2;
// System.out.println("area of rombus "+area_of_rombus);

//7.area of equalateral triangle 
// System.out.println("enter a side ");
// int side=sc.nextInt();
// double equalateral_triangle =(Math.sqrt(3)*side*side)/4;
// System.out.println("area of equalteral triangle "+equalateral_triangle);

//8. Perimeter Of Circle
// int radius = sc.nextInt();
// float pi =3.14f;
// float perimete_circle =2*pi*radius;
// System.out.println("peimeter of circle "+perimete_circle);

//9.Perimeter Of Equilateral Triangle

// int side = sc.nextInt();
// int parimeter_et = 3*side;
// System.out.println("parimeter et "+parimeter_et );

//10. Perimeter Of Parallelogram
// int base =sc.nextInt();
// int height =sc.nextInt();
// int pp=2*(base+height);
// System.out.println("Perimeter Of Parallelogram "+pp);

//11.Perimeter Of Rectangle

// int l =sc.nextInt();
// int w =sc.nextInt();
// int pr = 2*(l+w);
// System.out.println("Perimeter Of Rectangle "+pr);

//12. Perimeter Of Square
// int side =sc.nextInt();
// int ps = 4*side;
// System.out.println("Perimeter Of Square "+ps);

//13. Perimeter Of Rhombus

// int side =sc.nextInt();
// int pr = 4*side;
// System.out.println("Perimeter Of Rhombus "+pr);

//14.Volume Of Cone Java Program
// System.out.println("enter a radius ");
// int radius =sc.nextInt();
// System.out.println("enter a height ");
// int height = sc.nextInt();
// float pi = 3.14f;

// float vc = (1*pi*height*radius*radius)/3;
// System.out.println("Volume Of Cone Java Program " +vc);

//15. Volume Of Prism


// int base = sc.nextInt();
// int height =sc.nextInt();
// int vp = base*height;

// System.out.println("Volume Of Prism "+vp);

//16. Volume Of Cylinder
// float pi = 3.14f;
// int radius =sc.nextInt();
// int height =sc.nextInt();
// float vc = pi *radius *radius*height;
// System.out.println("Volume Of Cylinder  "+vc);

//17.Volume Of Sphere
// float pi = 3.14f;
// int radius =sc.nextInt();
// float vs = (4*pi*radius*radius*radius)/3;
// System.out.println("volume of sphere "+vs);

//18.Volume Of Pyramid  
// int b =sc.nextInt();
// int height= sc.nextInt();
// float vp = (1*b*height)/3;
// System.out.println("Volume Of Pyramid "+vp);

//19. Curved Surface Area Of Cylinder

// float pi = 3.14f;
// int radius =sc.nextInt();
// int height =sc.nextInt();

// float csc = (2*pi*radius*height);

// System.out.println("Curved Surface Area Of Cylinder "+csc);

//20.Total Surface Area Of Cube

// int side = sc.nextInt();
// int tsa = 6*side*side;
// System.out.println("Total Surface Area Of Cube "+tsa);

//21. Fibonacci Series In Java Programs
// int a = 0;
// int b =1;
// int temp = 0;
// int n =sc.nextInt();
// int i = 2;
// while(i<=n){

//     temp = b;
//     b = b+a;
//     a = temp;
//     System.out.println(b);
//     i++;
// }

//22. leet code ka question tha wahi solve kar diya ,Subtract the Product and Sum of Digits of an Integer
//23.Input a number and print all the factors of that number (use loops).

// int factor = 1;
// int n=sc.nextInt();

// while(factor <=n){
//     if(n%factor ==0){
//         System.out.println(factor );
//     }
//     factor++;
// }

    // by own require factorial questions 
    // int i = 1;
    // int factorial =1;
    // int n=sc.nextInt();
    // while(i<=n){
    //     factorial *=i;
    //     System.out.println(factorial);
    //     i++;
    // }

    //24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

    // int sum = 0;
    // while(true){
    //     System.out.println("enter a number ");
    //     int n =sc.nextInt();
    //     if(n==0){
    //         break;
    //     }
    //     sum +=n;
    // }
    //         System.out.println("sum  "+sum);

    //25. Take integer inputs till the user enters 0 and print the largest number from all.

    //  int largest = Integer.MIN_VALUE;
    //     int number;

    //     System.out.println("Enter numbers (enter 0 to stop):");

    //     while (true) {
    //         number = sc.nextInt();

    //         if (number == 0) {
    //             break;
    //         }

    //         if (number > largest) {
    //             largest = number;
    //         }
    //     }

    //     if (largest != Integer.MIN_VALUE) {
    //         System.out.println("The largest number entered is: " + largest);
    //     } else {
    //         System.out.println("No numbers were entered.");
    //     }

    //26. addition of two number 
    // int a =sc.nextInt();
    // int b =sc.nextInt();

    // int sum = a+b;
    // System.out.println(sum);

    // class Solution {
    // public int subtractProductAndSum(int n) {
       // public static void main(Strings args[]){
           // Scanner sc= new Scanner(System.in);

        //   int   n = sc.nextInt();
        //                int product= 1;
        //     int sum= 0;
        //   //  int Result;
        //     while(n!=0){
        //         int rem = n%10;
        //         product = product*rem;
        //         sum= sum+rem;
        //         n=n/10;
        //     }
        //     int  Result = product - sum;
        //     //System.out.println(Result);
        //     return Result;

        // ******************************** intermediate question ******************************
        // Calculate Electricity Bill
        // System.out.println("user :- enter a totao units ");
        // int unit = sc.nextInt();
        // int perunit = 5;
        // int eb = unit*perunit;
        // System.out.println("Calculate Electricity Bill "+eb);

        // Calculate Average Of N Numbers
        // int n =sc.nextInt();
        // int i=1;
        // int sum = 0;
        // float avg =1;
        // while(i<=n){
        //     sum +=i;
        //     i++;
           
        // }
        // avg = (float)sum/n;
        // System.out.println("avg "+avg);

        //Calculate Discount Of Product

    // discount off 15 % any item 
    //  System.out.println("ente item price ");
    //     int item =sc.nextInt();
    //     System.err.println((item*15)/100);


    //Calculate Distance Between Two Points
    // System.out.println("ente x1 ");
    // int x1 = sc.nextInt();
    // System.out.println("ente x2 ");
    // int x2 = sc.nextInt();
    
    // System.out.println("ente y1 ");
    // int y1 = sc.nextInt();
    // System.out.println("ente y2 ");
    // int y2 = sc.nextInt();

    // Object math;
    // int  dis=(int) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

    // System.out.println(" Distance "+dis);
    
    //Power In Java

    // System.out.println("enter a base value ");
    // double a= sc.nextDouble();
    // System.out.println("enter a power ");
    // double b=sc.nextDouble();
    // System.out.println(Math.pow(a,b));


    //Calculate Depreciation of Value

    // float a =sc.nextInt();
    // float rate = 10;
    // float time = 2;

    // float Depreciation = a * (float) (Math.pow((1-rate/100),time));
    // System.out.println("Depreciation "+Depreciation);
   //Depreciation = a*Depreciation;



// 9. Calculate Batting Average 
//      System.out.println("enter a matches ");
//    int matches =sc.nextInt();
//    System.out.println("enter a innings ");
//    int innings = sc.nextInt();
//    System.out.println("enter a total run ");
//    int totalrun = sc.nextInt();
//    System.out.println("enter a how many times he is notout ");
//    int notout =sc.nextInt();

//    double avg = totalrun/(innings-notout);
//    System.out.println("avg "+avg);

//10.Calculate CGPA Java Program
// int cgm =sc.nextInt();
// int dm =sc.nextInt();
// int se =sc.nextInt();
// int ar =sc.nextInt();

// double cgpa =(cgm+dm+se+ar)/4;
// System.out.println(cgpa);

//11. Compound Interest Java Program

// double p = sc.nextDouble();
// System.out.println("enter a rate");
// double r =sc.nextDouble();
// //System.out.println("enter a time of interest");
// double n=100;
// System.out.println("enter a time ");
// double t =sc.nextDouble();

// double ci = p*Math.pow(1+r/n,t);
// System.out.println("ci "+ ci);
//System.out.println("finally  ci is "+(p-ci));


//12. Calculate Average Marks

// int hindi =sc.nextInt();
// int english = sc.nextInt();
// int math =sc.nextInt();
// int physics = sc.nextInt();
// int chemistry =sc.nextInt();
// int avg = (hindi+english+math+physics+chemistry)/5;
// System.out.println("avg "+avg);




// //13.Sum Of N Numbers
// int n=sc.nextInt();
// int sum = 0;
// int i=1;
// while(i<=n){
//     sum+=i;
//     System.out.println(sum);
//     i++;
// }


//14.Armstrong Number In Java

// int n=sc.nextInt();
//  int armstrong=0;
// System.out.println("enter a same value ");
// int temp=sc.nextInt();
// while(n!=0){
//     int digit =n%10;
//     armstrong =armstrong+ (digit *digit * digit); 
//     n=n/10;
// }
// if(temp==armstrong){
//     System.out.println(" armstrong number ");

// }
// else {
//     System.out.println(" its not a armstrong no.");
// }

// find ncr and npr value 
// System.out.println("enter a n value ");
// int n =sc.nextInt();
// System.out.println("enter a r value ");
// int  r =sc.nextInt();
// //ncr
// int Result ;  baad me karenge 

//16 reverse string 
// String str ="pa nkaj";
// String rstr ="";
// char ch ;

// for (int i=0;i<str.length();i++){
//  ch = str.charAt(i);
//  rstr = ch+rstr;
// }
// System.out.println("Reverse Strings "+rstr);





//17.Find if a number is palindrome or not 

    // int n=sc.nextInt();
    // int rev =0;
    // System.out.println("enter a same value ");
    // int temp =sc.nextInt();
    // while(n!=0){
    //     int rem =n%10;
    //     rev= (rev*10)+rem;
    //     n=n/10;
    // }
    // System.out.println(" reverse "+rev);
    // if(rev==temp){
    //     System.out.println("palindrome ");
    // }
    // else{
    //     System.out.println("not palindrome ");
    // }

    //21.Java Program Vowel Or Consonant
    // char ch =sc.next().charAt(0);
    // if(ch == 'a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
    // System.out.println("it is vowel ");
    // }
    // else{
    //     System.out.println(" consonent ");
    // }

    //24. Sum Of A Digits Of Number

    // System.out.println("enter a value ");
    // int n =sc.nextInt();
    // int sum = 0;
    // int i = 0;
    // while(i<=n){
    // sum+=i;
    // i++;
    // System.out.println(sum);
    // }

    //
    
 
    }

    
}
