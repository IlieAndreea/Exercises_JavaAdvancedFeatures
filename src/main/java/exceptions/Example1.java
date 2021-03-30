package exceptions;

public class Example1 {
    static int sum(int num1, int num2) throws ArithmeticException{
        if (num1 == 0)
            throw new ArithmeticException("First parameter is not valid");
        else
            System.out.println("Both parameters are correct!!");
        return num1 + num2;
    }
    public static void main(String args[]){
        try {
            int res = sum(0,12);
            System.out.println(res);
            System.out.println("Continue Next statements");
        } catch (ArithmeticException e) {
            System.out.println("First parameter is not valid");
        }
    }
}
