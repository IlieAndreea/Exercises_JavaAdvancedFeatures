package inheritance.polymorphism;

class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println();
        super.sound();
        System.out.println("Wuf");
    }
}
