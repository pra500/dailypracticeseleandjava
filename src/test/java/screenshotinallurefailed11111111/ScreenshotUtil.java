package screenshotinallurefailed11111111;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
	
	
	
	
	public static String takeScreenshot(WebDriver driver, String screenshotName) {
        String filePath = System.getProperty("user.dir") + "/screenshots999999/" + screenshotName + ".png";
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source, new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filePath;

        
}
}