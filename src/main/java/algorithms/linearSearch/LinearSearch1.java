/** Java code for linearly searching x in arr[]. If x is present then return its location, otherwise return -1 */

package algorithms.linearSearch;

public class LinearSearch1 {

    public static int findX(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;

        int result = findX(arr, x);
        if(result == -1)
            System.out.println("The element is not present in this array!");
        else
            System.out.println("The element is at index " + result);
    }
}
