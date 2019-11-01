package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageComponent {

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePageComponent(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this);
    }

    public void selectCategory(String category) {
        WebElement openCategory = driver.findElement(By.xpath("//span[text()='" + category + "']"));
        openCategory.click();

    }
}
