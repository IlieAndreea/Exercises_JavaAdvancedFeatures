package exceptions;

public class CarCrashedException extends Exception {
    public CarCrashedException(Car car) {
        super("Car " + car + " has crashed!");
    }
}
