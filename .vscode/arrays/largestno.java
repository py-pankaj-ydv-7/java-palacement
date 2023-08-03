public class largestno {
    

    public static void main(String args[]){
        int num[]={10,21,45,65};
        int largest=num[0];
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }          
            
                
            
        }
System.out.println(largest);
    }
}
