package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderComponent {

    @FindBy(id = "username")
    private WebElement listaUsuario;
    @FindBy(xpath = "//*[@value='domain\\gdvelez']")
    private WebElement seleccionarUsuario;
    @FindBy(id = "btn-login")
    private WebElement botonIngresar;

    private WebDriver driver;
    private WebDriverWait wait;

    public HeaderComponent(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void ingresarUsuario() {
        listaUsuario.click();
        seleccionarUsuario.click();
        botonIngresar.click();
    }

}
