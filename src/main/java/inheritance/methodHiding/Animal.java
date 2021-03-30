package inheritance.methodHiding;

public class Animal {
    String color;

    Animal(String color) {
        this.color = color;
    }
    public Animal() {
        this("black");
    }

    public String toString() {
        return "This Animal is " + color;
    }

    public static void walk() {
        System.out.println("Animal walks!");
    }

    public String play() {
        return "Animal plays";
    }
}
