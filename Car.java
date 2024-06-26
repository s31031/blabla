public abstract class Car implements Refueling, FlyingAndLanding, Hover {
    int maxCapacity = 100;
    int currentCapacity = 0;
    @Override
    public void Hover() {
        int currentHeight = 5000;


    }
    @Override
    public void Flying() {
        System.out.println("Taking off");

    }

    @Override
    public void Landing() {
        System.out.println("Landing");


    }

    @Override
    public void refuel() {
        if (currentCapacity < 100) {
            currentCapacity++;
        }

    }

}
