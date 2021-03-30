package algorithms.sda;

public class Reverse {

    public static void reverseArray(int[] arr) {
        for(int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            int x;
                x = arr[i];
                arr[i] = arr[j];
                arr[j] = x;
        }

        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + ", ");
        }
    }
}
