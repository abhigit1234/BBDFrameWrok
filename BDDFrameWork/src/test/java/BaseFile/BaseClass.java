package BaseFile;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import PageObjectModel.POM;
import Utilities.ReadConfig;

public class BaseClass {

	public WebDriver driver;
	public FileInputStream fis;
	public Properties p;
	public JavascriptExecutor jse;
	public ReadConfig rc;
	public POM pom;
	
}
