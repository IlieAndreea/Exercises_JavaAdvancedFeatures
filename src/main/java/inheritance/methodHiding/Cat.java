package inheritance.methodHiding;

public class Cat  extends Animal {

    Cat(String color) {
        super(color);
    }

    public String toString() {
        return "This Cat is " + super.color;
    }

    public static void walk() {
        System.out.println("Cat walks!");
    }

    public String play() {
        return super.play() + " with Cat!";
    }
}
