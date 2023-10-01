public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {10,12,-7,3,4,28};
        System.out.println(linearSearchInRange(arr,3,1,4));
    }

    static int linearSearchInRange(int[] arr,int tar,int start,int end){
         if(arr.length ==0){
             return -1;
         }
         for(int i = start;i<=end;i++){
             int element = arr[i];
             if(arr[i]== tar){
                 return i;
             }
         }
         return -1;
    }
}
