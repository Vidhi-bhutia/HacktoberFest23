public class bubblesort {
    public static void bubblesort(int arr[]) {

        int n = arr.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                }
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 45, 65, 24, 78, 34, 12, 4 };

        System.out.println("Array before bubblesort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        bubblesort(arr);

        System.out.println("\nArray after bubblesort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
