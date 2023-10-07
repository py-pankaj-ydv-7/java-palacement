package javarestart.basic;

public class two_different_scope {
    public static void main(String [] args){

        // : Identifiers should not be duplicated with in the same scope, identifiers may be duplicated in two different scopes.

        
            int num=10;// Class level
           // short num=20;// Error , because  same variable present in same scope .
            double sal=33.33;// No Error
//           void print() {
//             float sal=22.22f; //local variable
//             double fsal=33.33;// Error
//             long num=30;//No Error            
//    }



                   

}
}