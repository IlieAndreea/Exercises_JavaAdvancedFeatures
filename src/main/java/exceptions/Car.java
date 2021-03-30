package exceptions;

public class Car {
    private String name;
    private int speed;

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void increaseSpeed() throws CarCrashedException {
        speed += 150;
        if(speed > 200) {
            throw new CarCrashedException(this);
        }
        System.out.println("Speed of " + name + " is " + speed);
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Car bmw = new Car("BMW", 60);
        try{
            bmw.increaseSpeed();
        } catch (CarCrashedException e) {
            System.out.println("Car " + bmw + " has crashed with the speed of " + bmw.speed);
        }
        System.out.println(bmw.speed);
    }
}
