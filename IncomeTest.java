import junit.framework.TestCase;
import static org.junit.jupiter.api.Assertions.*;

class IncomeTest extends TestCase {

    //Test #: 1
    //Objective: Test Range >= outside expected range
    //Input(s): Sum = -200
    //Expected O/P: "Invalid (low) values";

    public void testgetDescription001() {

        Income testObj = new Income(-200);

        assertEquals("Invalid (low) values", testObj.getDescription());

    }

}