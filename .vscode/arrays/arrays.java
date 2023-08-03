import java.util.*;
public class arrays {

    public static void update(int marks[]){
    for(int i=0; i<marks.length;i++){
        marks[i]=marks[i]+1;
    }
}


    public static void main(String args[]){

    // syntex to creating arrays 

    // int marks[]=new int [50];
    // int  numbers[] = {1,2,3};
    // String name[]={"pankaj "," Rajan "," Dheeraj "};// ese create karte hai array ko 

    // input/output 
    // int marks[] = new int [40];
    Scanner sc = new Scanner(System.in);

   // System.out.println("enter your marks ");

    // marks[0]=sc.nextInt();
    // marks[1]=sc.nextInt();
    // marks[2]=sc.nextInt();
// System.out.println();
//     System.out.println(marks[0]);
//     System.out.println(marks[1]);
//     System.out.println(marks[2]);

// System.out.println(" avg = "+(marks[0]+marks[1]+marks[0])/3);
// // arrays length 

// System.out.println("array length "+marks.length);


// passing arrays as argument ---->

int marks []={1,2,32,};
update(marks);

// //print our marks 
// for(int i=0;i<marks.length;i++){
//     System.out.println(marks[i]+" ");
// }
// System.out.println();

    
}
}