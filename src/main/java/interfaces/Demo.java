package interfaces;

public class Demo implements Intf1, Intf2 {

    public void method1() {
        System.out.println("From method1");
    }
    public void method2() {
        System.out.println("From method2");
    }

    public void method3() {
        System.out.println("From method3");
    }

    void demoMeth() {
        System.out.println("From demoMeth");
    }

    public static void main(String[] args) {
        Intf1 intf1 = new Demo();
        intf1.defaultMeth1();
//        intf1.getDivision();

        Intf2 intf2 = new Demo();
        System.out.println();
        intf2.method3();
        intf2.defaultMeth2();

        Demo demo = new Demo();
        System.out.println();
        demo.demoMeth();
        System.out.println(Intf1.x);
        demo.defaultMeth1();
        demo.defaultMeth2();

        Demo2 demo2 = new Demo2();
        demo2.methodTest();
    }


}
