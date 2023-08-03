public class revers_array {
    public static void main(String args[]){

        // int num=123;
        // int rev=0;
        // for(;num!=0;){
        //  int rem=num%10;
        //  rev=(rev*10)+rem;
        //  num=num/10;
        // }
        // System.out.println(rev);

        String str="abcde";
        String ch ="";
        // System.out.println(str.charAt(2));

        for(int i= str.length()-1; i>=0;i--){
           ch= ch+str.charAt(i);
        }
 System.out.println(ch);






    }
    
}
