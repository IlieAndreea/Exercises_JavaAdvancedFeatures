package interfaces;

public interface Intf1 {
    int x = 5;

    void method1();

    default void defaultMeth1() {
        System.out.println("From defaultMeth Intf1");
    }

//    private void division() {         // private method
//        System.out.println("private method division");
//    }
//
//    default void getDivision() {
//        division();
//    }
}
