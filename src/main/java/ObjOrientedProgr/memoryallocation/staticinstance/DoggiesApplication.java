/** Understanding Access of static and instance variables and methods (basics) */

package ObjOrientedProgr.memoryallocation.staticinstance;

public class DoggiesApplication {
    static int numberOfDogs;
    static String nameOfInstitute;

    static void changeNameOfInstitute(String newName) {
        nameOfInstitute = newName;
        System.out.println("\n" + nameOfInstitute);
    }


    public static void main(String[] args) {
        Doggies bobby = new Doggies(2, "Bobby");
        System.out.println(bobby);
        Doggies lilly = new Doggies(1.5,"Lilly");
        System.out.println(bobby);
        System.out.println(bobby);
        System.out.println(lilly);
        Doggies max = new Doggies( 6,"Max");
        Doggies rexy = new Doggies( 0.5,"Rexy");

        changeNameOfInstitute("Happy Dogs Institute");
        System.out.println("Total of dogs: " + numberOfDogs);
        System.out.println(bobby);
        System.out.println(lilly);
        System.out.println(max);
        System.out.println(rexy);
    }

}
