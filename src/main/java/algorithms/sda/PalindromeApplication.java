package algorithms.sda;

public class PalindromeApplication {

    public static void main(String[] args) {
        int[] e1 = {1, 2, 5, 5, 2, 1};
        int[] e2 = {2, 1, 1, 3, 1, 1, 2};

        System.out.println(Palindrome.isPalindrome(e1));
        System.out.println(Palindrome.isPalindrome(e2));
    }

}
