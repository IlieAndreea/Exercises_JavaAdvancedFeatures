/** Understanding memory allocation (Primitive Type and Reference Type - String */

package ObjOrientedProgr.memoryallocation;

public class Variables {

        public static void main(String[] args) {

        int x = 5;
        int y = 1;
        y = y + 10;

        String s1 = "12";
                System.out.println(s1);
        System.out.println(s1.hashCode());

        s1 = s1 + "3";
                System.out.println("\n" + s1);
        System.out.println(s1.hashCode());

        String s3 = "12";
                System.out.println("\n" + s3);
                System.out.println(s3.hashCode());

//        System.out.println(x);
//        System.out.println(x++);
//        System.out.println(x);
//        System.out.println(x + 1);
//        System.out.println(x);
//        System.out.println(x = x + 1);
//        System.out.println(x);
//
//        System.out.println("\n" + y);
    }
}
