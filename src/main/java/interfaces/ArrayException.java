package interfaces;

public class ArrayException {

    public static void main(String[] args) {

        try {
            int[] someIntArray = {3, 4, 2};
            printArrayElement(someIntArray, 3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void printArrayElement(int[] intArray, int index) throws Exception {
        if (index < 0 || index >= intArray.length) {
            throw new ArrayIndexOutOfBoundsException("Incorrect argument!");
        }
        System.out.println(intArray[index]);
    }
}
