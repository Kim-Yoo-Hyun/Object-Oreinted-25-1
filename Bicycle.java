package Week10;

public class Bicycle {
    public int cadence;
    public int speed;
    public int gear;

    public Bicycle(int cadence, int speed, int gear) {
        this.gear    = gear;
        this.cadence = cadence;
        this.speed   = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void printDescription() {
        System.out.println(
            "Bike is in gear " + gear +
            " with a cadence of " + cadence +
            " and travelling at a speed of " + speed + "."
        );
    }
}

