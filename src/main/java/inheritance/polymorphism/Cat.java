package inheritance.polymorphism;

public class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("\n" + "Meow");
    }

    int sound(int test) {               //In a subclass, you can overload the methods inherited from the superclass.
        System.out.println(test);       //Such overloaded methods neither hide nor override the superclass instance methods
        return test;                    //They are new methods, unique to the subclass.
    }

//    static void test() {
//        System.out.println("Child test");
//    }
}
