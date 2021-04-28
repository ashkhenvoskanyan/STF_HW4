import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickfileUploadButton();
        uploadPage.uploadFile("C:\\Users\\Ashkhen\\OneDrive\\Desktop\\CV");
        // I can not find the path
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver", "Uploaded files incorrect");
    }
}