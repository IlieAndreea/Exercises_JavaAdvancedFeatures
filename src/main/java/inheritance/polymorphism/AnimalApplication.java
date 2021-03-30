/** Understanding Polymorphism, Overriding, Overloading. */

package inheritance.polymorphism;

public class AnimalApplication {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.sumOf(5, 8.5);
        animal.sumOf(7.1, 3);

        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.play();
        cat.sound();
        cat.sound(356);
        cat.eat();

        Animal anim = new Cat();
        anim.sound();
        anim.play();
        anim.eat();
    }
}
