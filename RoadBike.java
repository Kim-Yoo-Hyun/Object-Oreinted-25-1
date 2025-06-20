package Week10;

public class RoadBike extends Bicycle {
    private int tireWidth;

    public RoadBike(int cadence, int speed, int gear, int tireWidth) {
        super(cadence, speed, gear);
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public void setTireWidth(int newWidth) {
        this.tireWidth = newWidth;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("The RoadBike" + " has " + getTireWidth() + " MM tires.");
    }
}
