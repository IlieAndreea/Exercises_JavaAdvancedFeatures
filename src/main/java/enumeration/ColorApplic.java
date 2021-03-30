package enumeration;

import static enumeration.Color.BLUE;

public class ColorApplic {

    public static void main(String[] args) {
        Color[] arr = Color.values();
        System.out.println(arr);

        for (Color col : arr) {
            System.out.println(col + " at index " + col.ordinal());
        }
        System.out.println(Color.valueOf("RED"));
        System.out.println(BLUE);
    }
}
