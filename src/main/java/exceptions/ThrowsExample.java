package exceptions;

public class ThrowsExample {

    private static void printArrayElement(int[] intArray, int index) throws Exception {
        if (index < 0 || index >= intArray.length) {
            throw new Exception("Incorrect argument! Change index!");
        }
        System.out.println(intArray[index]);
    }

    public static void main(String[] args) throws Exception{
        int[] someIntArray = {3, 4, 2};
        // invalid code - printArrayElement throws Exception, so it needs
// to be handled (putting it into try-catch or adding throws Exception
// to main method declaration will fix it).
        printArrayElement(someIntArray, -1);
    }
}
