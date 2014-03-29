package cars;

/**
 * Created by Artur on 24.03.2014.
 */
public class Volga extends Automobile {

    public Volga(double weight, String color, int id) {
        super(weight, color, id);
    }

    @Override
    public void ride() {
        super.ride();
        System.out.println("I'm slowly USSR car.");
    }

    @Override
    public String toString() {
        return super.toString() + " I'm VOLGA!!";
    }
}
