import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class TestDownload extends BaseTest {

    @Test
    public void TestDownloadProcess() {
        DownloadPage downloadPage = new DownloadPage(driver);

        downloadPage.navigate();

        // test data:
        int pollingTime = 1; // (seconds)

        downloadPage.clickDownload(pollingTime);
        Assertions.assertTimeout(Duration.ofSeconds(42), () -> {downloadPage.clickDownload(pollingTime);});


    }
}
