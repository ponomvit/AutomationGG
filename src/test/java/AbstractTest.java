import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import springConstructors.UserData;

/**
 * Created by vitaliypo on 7/20/2016.
 */

@ContextConfiguration(locations={"/spring-config.xml"})
public class AbstractTest extends AbstractTestNGSpringContextTests {

    @Autowired
    @Qualifier("userData01")
    public UserData userData01;

    @Autowired
    @Qualifier("test")
    public UserData test;


    @BeforeSuite
    public void init() {
        System.out.println(" Browser start");
    }
    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        System.out.println("Browser close");
    }


}
