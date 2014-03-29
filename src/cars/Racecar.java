package cars;

/**
 * Created by Artur on 23.03.2014.
 */
public abstract class Racecar extends Car {

    protected int speed;

    protected Racecar(double weight, String color, int speed, int id) {
        super(weight, color, id);
        this.speed = speed;
    }

    @Override
    public void ride() {
        System.out.println("I ride for racing win.");
    }

    public String toString() {
        return super.toString() + "I'm very fast car.";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
