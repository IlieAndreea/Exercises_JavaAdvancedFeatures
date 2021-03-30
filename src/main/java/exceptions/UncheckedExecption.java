package exceptions;

public class UncheckedExecption {
    public static void main(String args[]) throws Throwable{
//        int x = 0;
//        int y = 10;
//        int z = y/x;
        try {
            int a = 5 / 0;
        } catch(Exception e) {
            System.out.println("Exception is caught and handled!");
        }
    }
}
