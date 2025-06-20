package Week10;

public class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike(int cadence, int speed, int gear, String suspensionType) {
        super(cadence, speed, gear);
        this.suspension = suspensionType;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "MountainBike has a" + getSuspension() + " suspension.");
    }
}

