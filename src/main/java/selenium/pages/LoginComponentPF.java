package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginComponentPF {

    @FindBy(xpath = "//input[@name='username']")
    private WebElement inputUsername;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//input[@name='remember_me']")
    private WebElement checkRememberMe;
    @FindBy(xpath = "//button[@id='sign_in_btnundefined']")
    private WebElement buttonSignIn;

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginComponentPF(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this);
    }

    public void escribirUsuario(String usuario) {
        inputUsername.sendKeys(usuario);
    }

    public void escribirPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void aceptarRememberMe() {
        checkRememberMe.click();
    }

    public void clickSignIn() {
        buttonSignIn.click();
    }

    public void esperarQueCarguePopUp() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='PopUp']")));
    }

    public void esperarQueOcultePopUp(){
        wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@class='PopUp']"), "style", "display: none;"));
    }




}
