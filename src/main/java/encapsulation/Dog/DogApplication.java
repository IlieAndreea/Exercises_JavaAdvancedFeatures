package encapsulation.Dog;

public class DogApplication {

    public static void main(String[] args) {
//        Dog dog1 = new Dog("Blacky", 2, false, "Doberman", 10);
//        Dog dog2 = new Dog("Fluffy", 1,true,"Dalmatian",7);
        Dog dog3 = new Dog();
//        System.out.println(dog1);
//        System.out.println(dog2);
//        System.out.println(dog3);

        dog3.setWeight(8);
        System.out.println(dog3.getWeight());
        System.out.println();

        dog3.setName("");
        String testName = dog3.getName();

        System.out.println(testName);

    }
}
