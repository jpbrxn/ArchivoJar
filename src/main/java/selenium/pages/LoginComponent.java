package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginComponent {
    private WebDriver driver;

    public LoginComponent(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarUsuario(String usuario) {
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='username']"));
        inputUsername.sendKeys(usuario);
    }

    public void ingresarPassword(String password) {
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(password);
    }
}
