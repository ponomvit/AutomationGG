import org.testng.annotations.Test;

/**
 * Created by vitaliypo on 7/20/2016.
 */
public class FirstTest extends AbstractTest {

    @Test
    public void doNothing01() {
        System.out.println("Hello World 1");
        System.out.println(userData01.getFirstName());
    }

    @Test
    public void doNothing02() {
        System.out.println("Hello World 2");
    }
}
