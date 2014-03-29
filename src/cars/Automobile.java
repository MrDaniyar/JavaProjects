package cars;

/**
 * Created by Artur on 23.03.2014.
 */
public abstract class Automobile extends Car {

    protected Automobile(double weight, String color, int id) {
        super(weight, color, id);
    }

    @Override
    public void ride() {
        System.out.println("I ride passengers.");
    }

    public String toString() {
        return super.toString() + "I'm usual car.";
    }
}
