package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderComponent {

    @FindBy(xpath = "//a[@id='menuUserLink']")
    private WebElement buttonLogin;
    @FindBy(xpath = "//div[@icon-x]")
    private WebElement listProductCart;

    private WebDriver driver;
    private WebDriverWait wait;

    public HeaderComponent(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void esperarLoader() {
        wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@class='loader']"), "style", "display: none; opacity: 0;"));
    }

    public void clickLogin() {
        buttonLogin.click();
    }

}
