package encapsulation.Dog;

public class Dog {

    private String name;
    private int age;
    private boolean gender;    //if it is female is true;
    private String race;
    private int weight;

    public Dog(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !"".equals(name)) {
            this.name = name;
        }
    }

    public Dog(String name, int age, boolean gender, String race, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

//    public Dog(boolean gender, String race) {
//        this.gender = false;
//        this.race = null;
//    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        if(weight > 0) {
            this.weight = weight;
        }
    }

//    public String toString() {
//        return name + " " + age + " " + gender + " " + race + " " + weight + " ";
//    }

}
