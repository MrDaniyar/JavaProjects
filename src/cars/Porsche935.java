package cars;

/**
 * Created by Artur on 24.03.2014.
 */
public class Porsche935 extends Racecar {

    private Win winner;

    public void setWinListener(Win win) {
        winner = win;
    }

    public void win() {
        if (winner != null)
            winner.win();
    }

    public Porsche935(String color, double weight, int speed, int id) {
        super(weight, color, speed, id);
    }

    @Override
    public void ride() {
        super.ride();
        System.out.println("I have won a lot race.");
    }

    @Override
    public String toString() {
        return super.toString() + " I'm Porsche935.";
    }
}
