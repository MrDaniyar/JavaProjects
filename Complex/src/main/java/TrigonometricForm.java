/**
 * Created by Artur on 29.03.2014.
 */
public interface TrigonometricForm {

    /**
     * @return the angle of complex number
     * if moodule is too small it throws an exception
     */
    double arg() throws Exception;

    /**
     * @return module of trigonometric form of our complex number
     */
    double module();

}
