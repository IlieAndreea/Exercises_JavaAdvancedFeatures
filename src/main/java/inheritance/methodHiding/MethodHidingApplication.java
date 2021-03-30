package inheritance.methodHiding;

public class MethodHidingApplication {

    public static void main(String[] args) {

        Animal animal = new Cat("pink");
        animal.walk();                              //static method walk() - method hiding
        System.out.println(animal.toString());      //non- static method toString()
        System.out.println(animal.play());          //non- static method play()

        Cat cat = new Cat("green");
        Cat.walk();
        System.out.println(cat.toString());
        System.out.println(cat.play());
    }
}
