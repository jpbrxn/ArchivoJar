package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;

public class ShoppingCartComponent {
    @FindBy(xpath = "//a[@id='shoppingCartLink']")
    private WebElement buttonCart;
    @FindBy(xpath = "//a[@id='shoppingCartLink']")
    private WebElement actionCart;


    private WebDriver driver;
    private WebDriverWait wait;

    public ShoppingCartComponent(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
        PageFactory.initElements(driver, this);
    }

    public void deleteProducts() {
        Actions action = new Actions(driver);
        action.moveToElement(actionCart).build().perform();
        wait.until(ExpectedConditions.attributeContains(By.id("toolTipCart"), "style", "block"));
        try {
            List<WebElement> equisProducts = driver.findElements(By.xpath("//div[@icon-x]"));
            for (int i = equisProducts.size() - 1; i >= 0; i--) {
                equisProducts.get(i).click();
            }
        } catch (NoSuchElementException e) {

        }
    }
}
