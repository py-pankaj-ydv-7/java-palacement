public class secondlargestarray {

    public static void secondlargestarray(int arr []){

        // for(int i=0;i<arr.length;i++){

        //     // sort karenge 
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]>arr[j]){
        //         int temp = arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;
        //     }
        //     }
        // }
        // System.out.println(arr[arr.length-2]);
        // // System.out.println(" sorted array print ");
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");     
   
        // }
         int largest=0;
            int secondlargest=0;
            int third=0;

        for(int i=0;i<arr.length;i++){
           
            if(largest<arr[i]){
                largest=arr[i];
            }
         }

         for(int i=0;i<arr.length;i++){
            if(largest != arr[i] && secondlargest<arr[i]){
                secondlargest=arr[i];
            }
         }

         for(int i=0;i<arr.length;i++){
            if(arr[i]>third && arr[i] <secondlargest ){
                third=arr[i];
            }
         }
        System.out.println(third);
    }
    

    public static void main(String args[]){
        int arr []={98,45,55,1,2,3};
      secondlargestarray(arr);
    }
    
}
