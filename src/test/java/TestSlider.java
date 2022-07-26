import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSlider extends BaseTest {

    @Test
    public void TestSliders() throws Exception {
        SliderPage sliderPage = new SliderPage(driver);
        sliderPage.navigate();

        // drag every slider to right direction:
        sliderPage.dragSliders(40, 0);

        // test data: check that actual results don't equal to these values:
        int notExp1 = 10;
        int notExp2 = 50;
        int notExp3 = 30;
        int notExp4 = 50;
        int notExp5 = 50;
        int notExp6 = 50;

        int act1 = sliderPage.slider1Value();
        int act2 = sliderPage.slider2Value();
        int act3 = sliderPage.slider3Value();
        int act4 = sliderPage.slider4Value();
        int act5 = sliderPage.slider5Value();
        int act6 = sliderPage.slider6Value();

        Assertions.assertNotEquals(notExp1, act1);
        Assertions.assertNotEquals(notExp2, act2);
        Assertions.assertNotEquals(notExp3, act3);
        Assertions.assertNotEquals(notExp4, act4);
        Assertions.assertNotEquals(notExp5, act5);
        Assertions.assertNotEquals(notExp6, act6);
    }
}
