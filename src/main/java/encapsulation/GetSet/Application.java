package encapsulation.GetSet;

public class Application {

    public static void main(String[] args) {

        Person myObj1 = new Person();
        Person myObj2 = new Person();

        myObj1.setName("John");
        String personName1 = myObj1.getName();

        myObj2.setName("Ana");
        String personName2 = myObj2.getName();

        myObj1.setName("Max");
        String personName1_1 = myObj1.getName();

        myObj2.setName(personName1);

//        System.out.println(personName1);
//        System.out.println(personName1_1);
//        System.out.println(personName2);
        System.out.println(myObj1);
        System.out.println(myObj2);
    }
}
