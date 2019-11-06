package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IniciarCasoComponent {
    @FindBy(id = "menuListNew")
    private WebElement nuevoCaso;
    @FindBy(xpath = "//li/h3[contains(text(),'Soluciones Inmobiliarias')]")
    private WebElement selectSoluciones;

    private WebDriver driver;
    private WebDriverWait wait;

    public IniciarCasoComponent(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
        PageFactory.initElements(driver, this);
    }

    public void esperarCarga(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menuListNew")));
    }

    public void seleccionarSolucionesInmobiliarias() {
        nuevoCaso.click();
        selectSoluciones.click();
    }
}
