package inheritance.constructors;

public class Parent {
    String name;

    public Parent (String name) {
        this.name = name;
        System.out.println("Constructor of Parent " + name);
    }
    Parent(){
        System.out.println("Constructor of Parent");
    }
}
