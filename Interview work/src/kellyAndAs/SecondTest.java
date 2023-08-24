package kellyAndAs;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/browser_drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		try {
			List<String> usernames = Files.readAllLines(Paths.get("path/to/usernames.txt"));
			for (String username : usernames) {

				String loginUrl = "www.example.com/login/{username}";

				driver.get(loginUrl);

				WebElement pageTitle = driver.findElement(By.tagName("h1"));
				if (pageTitle.getText().equals("Welcome")) {
					System.out.println("Access granted for " + username);
				} else {
					System.out.println("Access denied for " + username);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.quit();
	}
}
