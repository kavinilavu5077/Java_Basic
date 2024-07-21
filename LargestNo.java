public class LargestNo {
    public static void main(String args[]){
        int arr[]= {1,8,2,9,4,5};
        int lar=arr[0];
        for(int i =0;i<arr.length;i++){
        
            if(arr[i]>lar){
                lar=arr[i];
            }
        }System.out.print(lar);
    }
    
}
