/**
 * Created by Artur on 29.03.2014.
 */
public interface ComplexMath {

    /**
     * sum this complex number with in params
     * @param complex
     */
    void sum(Complex complex);

    /**
     * sum between this complex number with in params
     * @param complex
     */
    void difference(Complex complex);

    /**
     * multiply each component of complex number with number in params
     * @param number
     */
    void productOnNumber(double number);
}
