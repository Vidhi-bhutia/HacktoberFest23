public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18,12,7,3,14,28};
        System.out.println(minNum(arr));
    }

    static int minNum(int[] arr){
        int min = arr[0];
        for(int i = 1;i< arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }

        return min;
    }
}
