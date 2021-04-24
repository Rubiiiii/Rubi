package Rubii;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {

		String exePath=Paths.get("").toAbsolutePath().toString() + File.separator +  "driver" + File.separator; //Setear la ruta de nuestro chrom
		System.setProperty("webdriver.chrome.driver",exePath + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Inicializando nuestro chromedriver
		driver.get("https://www.google.com");
  }
}
