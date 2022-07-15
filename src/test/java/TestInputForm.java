import org.junit.jupiter.api.Test;

public class TestInputForm extends BaseTest {

    @Test
    public void TestingInputForm() {
        InputFormPage inputForm = new InputFormPage(driver);
        inputForm.navigate();

        // test data:
        String firstName = "Bilbó";
        String lastName = "Zsákos";
        String email = "zsakos@hobbit.hu";
        String phone = "1234567890";
        String address = "Zsákvég utca 5.";
        String city = "Hobbitfalva";
        String state = "Hawaii";
        String zip = "1234";
        String web = "www.lotr.hu";
        // Hosting: Yes;
        String description =
                            """
                            Hol lehet
                            a
                            gyűrű??
                            """;

        inputForm.inputFirstName(firstName);
        inputForm.inputLastName(lastName);
        inputForm.inputEmail(email);
        inputForm.inputPhone(phone);
        inputForm.inputAddress(address);
        inputForm.inputCity(city);
        inputForm.selectState(state);
        inputForm.inputZip(zip);
        inputForm.inputWebSite(web);
        inputForm.clickHostingYes();
        inputForm.inputComment(description);

        inputForm.clickSend();

    }
}
