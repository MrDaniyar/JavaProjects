package Complex;

/**
 * Created by Artur on 22.03.14.
 */
public class Complex implements TrigonometricForm, ComplexActions, ComplexMath {

    private final static double DEFAULT_VALUE = 0;

    private double a;

    private double b;

    public Complex() {
        setA(DEFAULT_VALUE);
        setB(DEFAULT_VALUE);
    }

    public Complex(double a, double b) {
        setA(a);
        setB(b);
    }

    @Override
    public void conjugate() {
        setB(-getB());
    }

    @Override
    public double getModule() {
        return Math.sqrt(getA() * getA() + getB() * getB());
    }

    @Override
    public double getArg() {
        return Math.atan(getB() / getA());
    }

    @Override
    public void sum(Complex complex) {
        setA(getA() + complex.getB());
        setB(getB() + complex.getB());
    }

    @Override
    public void dif(Complex complex) {
        setA(getA() - complex.getB());
        setB(getB() - complex.getB());
    }

    @Override
    public void productOnNumber(double number) {
        setA(getA() * number);
        setB(getB() * number);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
