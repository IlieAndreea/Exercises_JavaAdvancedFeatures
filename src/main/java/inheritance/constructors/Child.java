/** Understanding Constructors - Inheritance */

package inheritance.constructors;

public class Child extends Parent{
    String myName;

    Child() {
        super("Bob");
        System.out.println("Constructor of Child with super");
    }

    Child(String myName) {
        this.myName = myName;
        System.out.println("Constructor of Child " + myName);
    }
    
    public static void main(String[] args) {
        Child superChild = new Child();

        System.out.println();
        new Child("Ben");

        System.out.println();
        Parent parent = new Parent("Susanna");

        System.out.println();
        Parent parent1 = new Child("Ana");

        System.out.println();
        Child child = new Child("Dan");
    }
}
