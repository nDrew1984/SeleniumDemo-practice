import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestAlertBox extends BaseTest {

    @Test
    public void TestAlertOK() {
        AlertBoxPage alertBoxPage = new AlertBoxPage(driver);

        alertBoxPage.navigate();
        alertBoxPage.clickPromptBox();

        // test data:
        String t = "Monica Belucci";

        alertBoxPage.enterText(t);
        alertBoxPage.clickAlertOK();

        String exp = "You have entered 'Monica Belucci' !";
        String act = driver.findElement(By.id("prompt-demo")).getText();
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void TestAlertCANCEL() {
        AlertBoxPage alertBoxPage = new AlertBoxPage(driver);

        alertBoxPage.navigate();
        alertBoxPage.clickPromptBox();

        // test data:
        String s1 = "Monica Belucci";
        String s2 = "Kim Basinger";

        alertBoxPage.enterText(s1);
        alertBoxPage.clickAlertOK();

        String exp = "You have entered 'Monica Belucci' !";
        String act = driver.findElement(By.id("prompt-demo")).getText();
        Assertions.assertEquals(exp, act);

        alertBoxPage.clickPromptBox();
        alertBoxPage.enterText(s2);
        alertBoxPage.clickAlertCANCEL();

        Assertions.assertEquals(exp, act);






    }
}
