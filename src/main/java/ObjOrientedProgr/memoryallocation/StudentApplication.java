/** Understanding hash code, hashCode() and ==, equals() */

package ObjOrientedProgr.memoryallocation;

public class StudentApplication {
    public static void main(String[] args) {

        Student alex1 = new Student(1, "Alex");
        Student alex2 = new Student(1, "Alex");
        System.out.println(alex1);
        System.out.println(alex1.hashCode());
        System.out.println(alex2);
        System.out.println(alex2.hashCode());
        System.out.println(alex1.equals(alex2));
        System.out.println(alex1 == alex2);
        System.out.println();
        System.out.println(alex1.getName().hashCode());
        System.out.println(alex2.getName().hashCode());
        System.out.println(alex1.getName().equals(alex2.getName()));
        System.out.println(alex1.getName() == alex2.getName());
        System.out.println();
        System.out.println(alex1.hashCode());
        System.out.println(alex1.equals(alex2));
        System.out.println(alex1 == alex2);
    }
}
