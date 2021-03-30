package ObjOrientedProgr.memoryallocation;

public class Geek {

    public  String geekName;

    public static void geek(String name) {
        Geek obj2 = new Geek();
        obj2.geekName = name;
    }

    public static void main(String[] args) {
//        System.out.println(geekName);
//        geekName = "Alex";
//        System.out.println(geekName);
        // Accessing the static method geek() and
        // field by class name itself.
//        Geek.geek("vaibhav");
//        System.out.println(Geek.geekName);

        // Accessing the static method geek() by using Object's reference.
        Geek obj = new Geek();
        obj.geek("mohit");
        System.out.println(obj.geekName);

//        System.out.println(geekName);

//        Geek obj2 = new Geek();
//        System.out.println(obj2.geekName);
    }
}