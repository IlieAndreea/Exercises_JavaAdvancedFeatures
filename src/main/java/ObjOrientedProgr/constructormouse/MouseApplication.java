/** Understanding this.    */

package ObjOrientedProgr.constructormouse;

import ObjOrientedProgr.constructormouse.Mouse;

public class MouseApplication {

    public static void main(String[] args) {
//        Mouse mouse1 = new Mouse("Jerry", 3, "brown", false);
//        Mouse mouse2 = new Mouse("Nibbels", 1, "gray", false);
//        Mouse mouse3 = new Mouse("Mickey", 5, "black", false);
//        Mouse mouse4 = new Mouse("Minny", 4, "black and white", true);


//        System.out.println(mouse1.age);
//        System.out.println(mouse2);
//        System.out.println(mouse3);
//        System.out.println(mouse4);

        Mouse mouse1 = new Mouse("Mickey", 2);
//        System.out.println(mouse1);

        Mouse mouse2 = new Mouse("Jerry", 1);
//        System.out.println(mouse2);
//        System.out.println(mouse1);
        int hashC = mouse1.hashCode();
        System.out.println(hashC);



    }
}
