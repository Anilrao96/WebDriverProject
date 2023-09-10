package BarcodeAutomation;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
//import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;

public class Barcodeautomation {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		String barCodeURL = driver.findElement(By.xpath("//*[@id=\"HTML12\"]/div[1]/img[1]")).getAttribute("src");
		System.out.println(barCodeURL);
		
		
//		URL url = new URL(barCodeURL);
//		BufferedImage bufferedImage = ImageIO.read(url);
//		LuminanceSource luminanceSource= new BufferedImageLuminanceSource(bufferedImage);
//		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
//		Result result = new MultiFormatReader().decode(binaryBitmap);
//		System.out.println(result.getText());
	}

}
