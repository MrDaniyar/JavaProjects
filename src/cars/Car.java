package cars;

/**
 * Created by Artur on 23.03.2014.
 */
public abstract class Car implements Rideable {

    protected double weight;

    protected String color;

    protected int id;

    protected Car(double weight, String color, int id) {
        this.weight = weight;
        this.color = color;
        this.id = id;
    }

    public String toString() {
        return "I'm car. My id - " + id + ". ";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
