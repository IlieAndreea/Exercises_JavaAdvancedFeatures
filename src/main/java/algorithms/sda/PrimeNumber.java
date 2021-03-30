package algorithms.sda;
import java.util.Scanner;

public class PrimeNumber {

    public static void main (String[] args) {
//        if(number <= 1)
//            System.out.println(number + " is a not a prime number!");
//        if(number == 2)
//            System.out.println(number + " is a prime number!");
//
//        for (int n = 2; n < number; n++) {
//            if (number % n == 0)
//                System.out.println(number + " is a not a prime number!");
//
//            else if (number % n != 0)
//                System.out.println(number + " is a prime number!");
//        }
//    }
//
//    public static void main(String[] args) {
//        int number = 4;
//        checkIfPrime(number);
        int temp;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter any number:");
        //capture the input in an integer
        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }
}
