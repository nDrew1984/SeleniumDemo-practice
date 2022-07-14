import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestNameCards extends BaseTest {

    @Test
    @Description("Creating a txt file, and save the namecard datas to it.")
    public void TestNameCard() throws IOException {
        NameCardPage nameCardPage = new NameCardPage(driver);

        nameCardPage.navigate();

        // creating file:
        String filename = "saveData.txt";
        nameCardPage.createFile(filename);

        nameCardPage.saveData(filename);

        // number of rows in the file:
        long n = Files.lines(Path.of(filename)).count();

        // Comparing the number of the name-cards and the number of the table serials:
        long exp = nameCardPage.getSize();
        long act = n-1;
        Assertions.assertEquals(exp, act);


    }
}
