package ObjOrientedProgr.memoryallocation.staticinstance;

public class EqualsTesting {
    public static void main(String[] args) {

        String s1 = new String("Alex");
        String s2 = new String("Alex");

        System.out.println(s1 == s2);
        System.out.print("\n");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.hashCode());
        System.out.println((s2.hashCode()));

        System.out.println();
        String p1 = "John";
        String p2 = "John";

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.hashCode() == p2.hashCode());

    }
}
