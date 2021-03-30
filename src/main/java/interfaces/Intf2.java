package interfaces;

public interface Intf2 {
    void method2();
    void method3();

    default void defaultMeth2() {
        System.out.println("From defaultMeth Intf2");
    }
}
