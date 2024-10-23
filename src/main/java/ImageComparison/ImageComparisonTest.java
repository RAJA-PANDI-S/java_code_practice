package ImageComparison;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageComparisonTest {

    WebDriver driver;

    public void captureScreenshot(WebDriver driver, String filePath) throws IOException {
        // Capture screenshot using AShot
        Screenshot screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver);
        BufferedImage image = screenshot.getImage();

        // Save the screenshot
        ImageIO.write(image, "PNG", new File(filePath));
    }

    public void compareImages(String baselinePath, String currentScreenshotPath, String diffImagePath) throws IOException {
        // Load baseline and current screenshot images
        BufferedImage baselineImage = ImageIO.read(new File(baselinePath));
        BufferedImage currentImage = ImageIO.read(new File(currentScreenshotPath));

        // Compare the images using AShot
        ImageDiffer imgDiff = new ImageDiffer();
        ImageDiff diff = imgDiff.makeDiff(baselineImage, currentImage);

        // Check if there's any difference
        if (diff.hasDiff()) {
            System.out.println("Differences found! Saving diff image...");
            // Save the difference image
            ImageIO.write(diff.getMarkedImage(), "PNG", new File(diffImagePath));
        } else {
            System.out.println("Image compared successfully. No difference found.");
        }
    }

    public void testImageComparison() throws IOException {
        // Specify paths for baseline, screenshot, and difference images
        String baselinePath = "src\\main\\resources\\Img_Baseline\\TradingView_Chart.png";
        String screenshotPath = "src\\main\\resources\\Img_Screenshot\\TradingView_Chart.png";
        String diffImagePath = "src\\main\\resources\\Img_Differences\\Compared_Img.png";

        // Capture the current screenshot
        captureScreenshot(driver, screenshotPath);

        // Compare the captured screenshot with the baseline image
        compareImages(baselinePath, screenshotPath, diffImagePath);

    }
}

