package ObjOrientedProgr.constructormouse;

public class Mouse {

    String name;
    int age;
//    String color;
//    boolean gender;     // Female = true;

//    public Mouse(String name, int age, String color, boolean gender) {
//        name = "Nibbles";
//        age = 6;
//        color = "pink";
//        gender = true;
//        this.name = name;
//        this.age = age;
//        this.color = color;
//        this.gender = gender;

//            }

//    public String toString() {
//        return name + ", " + age + ", " + color + ", " + gender;
//    }

    public Mouse(String newName, int Nage) {
        this.name = newName;
        age = Nage;
    }

    public String toString() {
        return this.name + " " + this.age;
    }
    
}
