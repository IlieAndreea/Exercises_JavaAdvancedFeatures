package algorithms;

import algorithms.sda.Palindrome;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class PalindromeTest {

  @BeforeAll
   public static void setUp() {
      System.out.println("Before all tests");
   }

   @Test
   public void isPalindromeTest() {
      //given
       int[] e1 = { 1, 2, 5, 5, 2, 1};
       int[] e2 = { 2, 1, 1, 3, 2, 1};
       int[] e3 = { 1, 3, 5, 3, 1};
       int[] e4 = { 4, 8, 7};
       int[] e5 = { 10, 20, 20, 30, 40, 50, 50};
       //when
       boolean testResultE1 = Palindrome.isPalindrome(e1);
       //then
       Assertions.assertTrue(testResultE1);
       Assertions.assertFalse(Palindrome.isPalindrome(e2));
       Assertions.assertTrue(Palindrome.isPalindrome(e3));
       Assertions.assertFalse(Palindrome.isPalindrome(e4));
       Assertions.assertFalse(Palindrome.isPalindrome(e5));
   }

   @AfterAll
   public static void tearDown() {
       System.out.println("After all tests");
   }
}
