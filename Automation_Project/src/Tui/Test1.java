package Tui;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation_Testing\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		
		c1.close();
		
	}

}
