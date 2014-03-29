package cars;

/**
 * Created by Artur on 23.03.2014.
 */
public abstract class Truck extends Car {

    protected Truck(double weight, String color, int id) {
        super(weight, color, id);
    }

    @Override
    public void ride() {
        System.out.println("I ride different shipment.");
    }

    public String toString() {
        return super.toString() + "I'm har truck.";
    }
}
