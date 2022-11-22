import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInputFields extends BaseTest {

    @Test
    public void TestSumValidNumbers() {
        BasicFirstFormDemoPage basicFirstFormDemoPage = new BasicFirstFormDemoPage(driver);

        basicFirstFormDemoPage.navigate();
        //basicFirstFormDemoPage.closePopupWindow();

        // test valid data:
        int a = 5;
        int b = 6;

        basicFirstFormDemoPage.inputA(String.valueOf(a));
        basicFirstFormDemoPage.inputB(String.valueOf(b));
        basicFirstFormDemoPage.clickGetTotal();

        String exp = "11";
        String act = basicFirstFormDemoPage.totalNumber();
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void TestSumRandomNumbers() {
        BasicFirstFormDemoPage basicFirstFormDemoPage = new BasicFirstFormDemoPage(driver);
        basicFirstFormDemoPage.navigate();
        basicFirstFormDemoPage.scrollDown();

        for (int i = 0; i < 20; i++) {
            int a = basicFirstFormDemoPage.getRandomNumber(-1000000000, 1000000000);
            int b = basicFirstFormDemoPage.getRandomNumber(-1000000000, 1000000000);

            basicFirstFormDemoPage.inputA(String.valueOf(a));
            basicFirstFormDemoPage.inputB(String.valueOf(b));
            basicFirstFormDemoPage.clickGetTotal();

            String exp = String.valueOf(a + b);
            String act = basicFirstFormDemoPage.totalNumber();

            Assertions.assertEquals(exp, act);
            basicFirstFormDemoPage.clear();
        }
        driver.quit();
    }

    @Test
    public void TestSumInvalidNumbers() {
        BasicFirstFormDemoPage basicFirstFormDemoPage = new BasicFirstFormDemoPage(driver);

        basicFirstFormDemoPage.navigate();
        //basicFirstFormDemoPage.closePopupWindow();

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

    @Test
    public void TestRandomMessages() {
        BasicFirstFormDemoPage basicFirstFormDemoPage = new BasicFirstFormDemoPage(driver);
        basicFirstFormDemoPage.navigate();

        for (int i = 0; i < 20; i++) {
            String exp = basicFirstFormDemoPage.getRandomString(10);
            basicFirstFormDemoPage.enterText(exp);

            basicFirstFormDemoPage.clickShowMessageButton();

            String act = basicFirstFormDemoPage.getTextResult();
            Assertions.assertEquals(exp, act);

            basicFirstFormDemoPage.clearText();
        }
        driver.quit();
    }

    @Test
    public void TestMessage() {
        BasicFirstFormDemoPage basicFirstFormDemoPage = new BasicFirstFormDemoPage(driver);
        basicFirstFormDemoPage.navigate();

        String exp = "<>#&@{}?:;-_$ß€[]äđ+!=";
        basicFirstFormDemoPage.enterText(exp);

        basicFirstFormDemoPage.clickShowMessageButton();

        String act = basicFirstFormDemoPage.getTextResult();
        Assertions.assertEquals(exp, act);

        driver.quit();
    }
}
