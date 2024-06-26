public abstract class FlyingVehicle implements FlyingAndHovering, Hover, Refueling, FlyingAndLanding {
    private int capacity;
    private int seatsNumber;
    boolean engineRunning;
    private int maxcapacity = 100;

  public int getCapacity() {
        return capacity;
}

    public void setCapacity(int capacity) {
        this.capacity = capacity;
}
    public void setSeatsNumber(int seatsNumber) {
      this.seatsNumber = seatsNumber;
    }
    public int getSeatsNumber() {
      return seatsNumber;
    }
    public void startVehicle() {
        engineRunning = true;

    }
    public void stopVehicle() {
      engineRunning = false;
    }
    public void refuel() {
      while (capacity < maxcapacity) {
          capacity++;
      }
    }


}
