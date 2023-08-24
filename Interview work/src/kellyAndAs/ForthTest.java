package kellyAndAs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForthTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/browser_drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.securityQuestion");

		WebElement answerInput = driver.findElement(By.id("answer-sec"));
		answerInput.sendKeys("CorrectAnswer");

		WebElement submitButton = driver.findElement(By.id("submit-btn"));
		submitButton.click();

		WebElement resultMessage = driver.findElement(By.id("result-msg"));
		String message = resultMessage.getText();
		if (message.equals("Correct")) {
			System.out.println("The answer is correct");
		} else if (message.equals("Incorrect")) {
			System.out.println("The answer is incorrect");
		} else {
			System.out.println("Unexpected result message: " + message);
		}

		driver.quit();

	}

}
