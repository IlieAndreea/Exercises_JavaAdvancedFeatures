package algorithms.sda;
//palindrom: int[] n = {1, 2, 5, 5, 2, 1};
//i :
//j:
//i:
//j:

public class Palindrome {

    public static boolean isPalindrome(int[] e) {
        for (int i = 0, j = e.length - 1; i <= j; i++, j--) {
            if (e[i] != e[j])
                return false;
        }
        return true;
    }
}
