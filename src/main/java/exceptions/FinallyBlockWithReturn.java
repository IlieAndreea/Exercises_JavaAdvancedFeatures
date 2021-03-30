package exceptions;

public class FinallyBlockWithReturn {

    public static void main(String[] args) {
        System.out.println(myMethod());
    }

    public static int myMethod() {
        try {
            System.out.println("From try block");
            return 112;
        }
        finally {
            System.out.println("This is Finally block");
            System.out.println("Finally block ran even after return statement");
        }
    }
}
