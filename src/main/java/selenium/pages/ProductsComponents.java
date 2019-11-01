package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsComponents {
    private WebDriver driver;
    private WebDriverWait wait;

    public ProductsComponents(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void selectProducts(String article) {
        WebElement selectArticle = driver.findElement(By.xpath("//a[text()='" + article + "']"));
        selectArticle.click();
    }

    public void esperarVirtualFooter() {
        wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@id='virtualFooter']"), "style", "display: block; position: relative; height: 380px; width: 100%;"));
    }
}
