package nestedclass;

public class MyWheel {
//    private Bicycle bicycle;

//    public MyWheel(Bicycle bicycle) {
//        this.bicycle = bicycle;
//    }

    public void damage(Bicycle bicycle) {
        bicycle.setMaxSpeed((int) (bicycle.getMaxSpeed() * 0.5));
    }

}
