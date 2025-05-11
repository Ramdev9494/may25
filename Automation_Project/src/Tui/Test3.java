package Tui;

public class Test3 
{
	public static void main(String[] args) {
        // Set the path for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "F:/Automation_Testing/chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage
        driver.get("https://www.example.com");

        // Perform actions or tests here

        // Close the browser
        driver.quit();
    }
	
	
	
}
