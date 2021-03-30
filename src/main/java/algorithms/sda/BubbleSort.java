package algorithms.sda;

public class BubbleSort {

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int x;
                    x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                }
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + ", ");
        }
    }
}
