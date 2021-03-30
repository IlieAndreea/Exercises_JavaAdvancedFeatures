package exceptions;

public class StringIndexOutOfBoundsE {

    public static void main(String args[]) {
        try {
            System.out.println("From try block");
            String str = "beginnersbook";
            System.out.println(str.length());
            char c = str.charAt(40);
            System.out.println(c);
            System.out.println("From try block 2");
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException!!   " + e);
        }
    }
}

