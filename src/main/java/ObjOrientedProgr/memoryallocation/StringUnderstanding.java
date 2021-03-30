package ObjOrientedProgr.memoryallocation;


public class StringUnderstanding {

    static String name = "John";

    public void transformIntoHexa(String name) {
        String hex = Integer.toHexString(hashCode());
        System.out.println(hex);

    }

    public static void main(String[] args) {
        StringUnderstanding obj = new StringUnderstanding();

        obj.transformIntoHexa("Alex");
        System.out.println(obj.hashCode());
        System.out.println(obj);
        System.out.println(name.hashCode());
    }

}
