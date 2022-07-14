import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInputFields extends BaseTest{

    @Test
    public void TestSumValidNumbers() {
        BasicFirstFormDemoPage basicFirstFormDemoPage = new BasicFirstFormDemoPage(driver);

        basicFirstFormDemoPage.navigate();
        basicFirstFormDemoPage.closePopupWindow();

        // test valid data:
        int a = 5;
        int b = 6;

        basicFirstFormDemoPage.inputA(String.valueOf(a));
        basicFirstFormDemoPage.inputB(String.valueOf(b));
        basicFirstFormDemoPage.clickGetTotal();

        int exp = 11;
        int act = basicFirstFormDemoPage.totalNumber();
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void TestSumInvalidNumbers() {
        BasicFirstFormDemoPage basicFirstFormDemoPage = new BasicFirstFormDemoPage(driver);

        basicFirstFormDemoPage.navigate();
        basicFirstFormDemoPage.closePopupWindow();

        // test invalid data:
        String a = "abc";
        String b = "def";

        basicFirstFormDemoPage.inputA(a);
        basicFirstFormDemoPage.inputB(b);
        basicFirstFormDemoPage.clickGetTotal();

        String exp = "NaN";
        String act = basicFirstFormDemoPage.totalString();

        Assertions.assertEquals(exp, act);
    }
}
