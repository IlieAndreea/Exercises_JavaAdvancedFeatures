package algorithms.sda;

public class FrequencyVector {

    public static int findMissingNumber(int[] arr, int maxNumber) {
        int[] f = new int[maxNumber + 1];

        for (int i = 0; i < f.length; i++) {
            f[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            f[arr[i]]++;
        }

        for (int i = 1; i < f.length; i++) {
            if (f[i] == 0) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};

        int missingNumber = findMissingNumber(arr, 10);
        System.out.println("The missing number is: " + missingNumber);
    }
}
