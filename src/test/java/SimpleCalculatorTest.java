import org.junit.jupiter.api.*;
import org.ponuch.lesson6.controller.BaseCalculator;
import org.ponuch.lesson6.controller.SimpleCalculator;
import org.ponuch.lesson6.model.OperationData;
import org.ponuch.lesson6.model.OperationType;

public class SimpleCalculatorTest {

    private final BaseCalculator calculator = new SimpleCalculator();

    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }

    @Test
    void testCalcAddSuccess()
    {
        System.out.println("======TEST ADD EXECUTED=======");
        Assertions.assertEquals( 4.0 ,
                calculator.calculate(new OperationData(2, 2, OperationType.ADD)).result());
    }

    @Test
    void testCalcSubSuccess()
    {
        System.out.println("======TEST SUB EXECUTED=======");
        Assertions.assertEquals( 6.0 ,
                calculator.calculate(new OperationData(8, 2, OperationType.SUB)).result());
    }

    @Test
    void testCalcMulSuccess()
    {
        System.out.println("======TEST MUL EXECUTED=======");
        Assertions.assertEquals( 36.0 ,
                calculator.calculate(new OperationData(9, 4, OperationType.MUL)).result());
    }

    @Test
    void testCalcDivSuccess()
    {
        System.out.println("======TEST DIV EXECUTED=======");
        Assertions.assertEquals( 9.0 ,
                calculator.calculate(new OperationData(36, 4, OperationType.DIV)).result());
    }

    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }

    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}

