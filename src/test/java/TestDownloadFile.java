import org.junit.jupiter.api.Test;

public class TestDownloadFile extends BaseTest {

    @Test
    public void TestDownloadFile() throws InterruptedException {
        DownloadFilePage downloadFilePage = new DownloadFilePage(driver);
        downloadFilePage.navigate();

        // test data:
        String text = "This is a test string.";

        downloadFilePage.enterText(text);
        downloadFilePage.clickGenerateFile();
        downloadFilePage.clickLinkToDownload();
    }
}
