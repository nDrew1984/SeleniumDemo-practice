import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestRadioButtons extends BaseTest {

    @Test
    public void TestRadio() {
        RadioButtonDemoPage radioButtonDemoPage = new RadioButtonDemoPage(driver);

        radioButtonDemoPage.navigate();

        radioButtonDemoPage.clickFemale1();
        radioButtonDemoPage.clickGetCheckedValue();

        String exp = "Radio button 'Female' is checked";
        String act = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]")).getText();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void TestGroupRadio() {
        RadioButtonDemoPage radioButtonDemoPage = new RadioButtonDemoPage(driver);

        radioButtonDemoPage.navigate();

        radioButtonDemoPage.clickFemale2();
        radioButtonDemoPage.clickAge1550();
        radioButtonDemoPage.clickGetValues();

        String exp = "Sex : Female\n" +
                "Age group: 15 - 50";
        String act = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]")).getText();

        Assertions.assertEquals(exp, act);


    }
}
