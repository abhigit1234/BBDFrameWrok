package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import BaseFile.BaseClass;

public class ReadConfig extends BaseClass{

	
	public ReadConfig() {
		try {
			 fis = new FileInputStream("src/test/resources/config.properties");
			 p=new Properties();
			 p.load(fis);
		} catch (Exception e) {
			}
	}
	
	public String browser() {
		String browser = p.getProperty("browser");
		if(browser!=null) {
			return browser;
		}else {
			throw new RuntimeException("browser not initialised");
		}
	}
	public String url() {
		String url = p.getProperty("url");
		if(url!=null) {
			return url;
		}else {
			throw new RuntimeException("url not launched");
		}
	}
	
	public String email() {
		String email = new RandomStringUtils().randomAlphanumeric(10)+"@gmail.com";
		return email;
	}
}
