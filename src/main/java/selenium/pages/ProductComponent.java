package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class ProductComponent {
    private WebDriver driver;
    private WebDriverWait wait;

    public ProductComponent(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void esperarQueMuestreLoader() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='loader']")));
    }

    public void mostrarOculteLoader() {
        wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@class='loader']"), "style", "display: none; opacity: 0;"));
    }

    public void incrementarCantidad(int quantity) {
        for (int i = 1; i < quantity; i++) {
            WebElement sumarItem = driver.findElement(By.xpath("//div[@class='plus']"));
            sumarItem.click();
        }
    }

    public void selectColor(String color) {
        WebElement selectColor = driver.findElement(By.xpath("//span[@title='" + color + "' and @id='bunny']"));
        selectColor.click();
    }

    public void addCart() {
        WebElement buttonAddCart = driver.findElement(By.xpath("//button[@name='save_to_cart']"));
        buttonAddCart.click();
    }

    public void shoppingCart(int quantity){
        String variable = driver.findElement(By.xpath("//h2[@class='roboto-thin screen768 ng-binding']")).getText();
        String removePrice = variable.replace("$", "").replace(",", "");
        double total = Double.parseDouble(removePrice) * quantity;
        WebElement openCart = driver.findElement(By.xpath("//button[@id='checkOutPopUp']"));
        openCart.click();
        wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@id='virtualFooter']"), "style", "display: block; position: relative; height: 380px; width: 100%;"));
        WebElement textResult = driver.findElement(By.xpath("//p[@class='price roboto-regular ng-binding']"));
        String priceResult = textResult.getText();
        String removePriceResult = priceResult.replace("$", "").replace(",", "");
        double totalPrice = Double.parseDouble(removePriceResult);
        assertThat(Math.rint(totalPrice * 100) / 100, is(equalTo(Math.rint(total * 100) / 100)));
    }


}
