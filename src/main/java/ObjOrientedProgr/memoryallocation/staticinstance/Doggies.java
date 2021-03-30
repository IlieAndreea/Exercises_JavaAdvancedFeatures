package ObjOrientedProgr.memoryallocation.staticinstance;

public class Doggies {

    double age;
    String dogName;
    static int id;
    int idCounter;

    Doggies(double age, String dogName){
        this.age = age;
        this.dogName = dogName;
        DoggiesApplication.numberOfDogs++;
        idCounter = ++id;
    }

    @Override
    public String toString() {
        return id + " " +idCounter + ". Dog name: " + dogName + ", age: " + age + ", location: " + DoggiesApplication.nameOfInstitute;
    }

}
