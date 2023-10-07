package javarestart.basic;

public class booleanlogical {
    public static void main(String [] args){

        boolean s1 =true;
        boolean s2 =false;
        
        System.out.println("--------------- AND -------------- ");
        System.out.println(s1&s2);
        System.out.println(s1&s1);
        System.out.println(s1&s2);
        System.out.println(s1&s1);
        System.out.println();
        System.out.println("--------------- OR -------------- ");
        System.out.println();
        System.out.println(s1|s1);
        System.out.println(s1|s2);
        System.out.println(s2|s1);
        System.out.println(s2|s2);
        
         
        System.out.println("----------- XOR ------------------ ");
        System.out.println();
        System.out.println(s1^s1);// SAM HOTA HAI BO FASLE ATAAA HAI 
        System.out.println(s1^s2);
        System.out.println(s2^s1);
        System.out.println(s2^s2);


    }
    
}
