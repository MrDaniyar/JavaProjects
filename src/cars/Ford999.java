package cars;

/**
 * Created by Artur on 24.03.2014.
 */
public class Ford999 extends Racecar {

    public Ford999(String color, double weight, int speed, int id) {
        super(weight, color, speed, id);
    }

    @Override
    public void ride() {
        super.ride();
        System.out.println("I'm the fastest ancient car.");
    }

    @Override
    public String toString() {
        return super.toString() + " I'm Ford999.";
    }
}
