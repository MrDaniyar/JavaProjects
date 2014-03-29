/**
 * Created by Artur on 29.03.2014.
 */
public class Complex implements ComplexActions, ComplexMath, TrigonometricForm {

    //real part
    private double a;

    //imagine part
    private double b;

    private static final double DEFAULT_VALUE = 0;

    //epsilon to compare 2 double values
    private static final double EPS = 1e-12;

    public Complex() {
        setA(DEFAULT_VALUE);
        setB(DEFAULT_VALUE);
    }

    public Complex(double a, double b) {
        setA(a);
        setB(b);
    }

    /**
     * toString
     *
     * @return a+ib or a-ib according to sign b
     */
    @Override
    public String toString() {
        String result = "a";
        result += getB() < 0 ? "-i" : "+i";
        return result + "b";
    }

    /**
     * equla method
     *
     * @param complex - number, which we want to compare with this
     * @return if real and imagine parts are the EPS same - true
     */
    public boolean equals(Complex complex) {
        return Math.abs(getA() - complex.getA()) < EPS &&
                Math.abs(getB() - complex.getB()) < EPS;
    }

    @Override
    public void conjugate() {
        setB(-getB());
    }

    @Override
    public void sum(Complex complex) {
        setA(getA() + complex.getA());
        setB(getB() + complex.getB());
    }

    @Override
    public void difference(Complex complex) {
        setA(getA() - complex.getA());
        setB(getB() - complex.getB());
    }

    @Override
    public void productOnNumber(double number) {
        setA(getA() * number);
        setB(getB() * number);
    }

    @Override
    public double arg() throws Exception {
        if ((Math.abs(getA()) < 1e-12) && (Math.abs(getB()) < 1e-12))
            throw new Exception("Argument is undefined, module is too small!");
        return Math.atan(getB() / getA());
    }

    @Override
    public double module() {
        return Math.abs(getA() * getA() + getB() * getB());
    }

    //getters & setters
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
