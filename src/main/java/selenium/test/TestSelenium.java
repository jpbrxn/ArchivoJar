package selenium.test;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.pages.*;

import java.util.concurrent.TimeUnit;

public class TestSelenium {
    private WebDriver driver;
    private LoginComponentPF loginComponentPF;
    private HeaderComponent headerComponent;
    private ShoppingCartComponent shoppingCartComponent;
    private HomePageComponent homePageComponent;
    private ProductsComponents productsComponents;
    private ProductComponent productComponent;
    private LoaderL loader;





    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\1742703\\Documents\\Juan Pablo Becerra\\2-Confidenacial Personal\\1-Personal\\Prueba\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars", "--start-maximized", "--no-sandbox");
       // DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("pageLoadStrategy", "normal");
        //options.merge(capabilities);
        driver = new ChromeDriver(options);
        loginComponentPF = new LoginComponentPF(driver);
        headerComponent = new HeaderComponent(driver);
        shoppingCartComponent = new ShoppingCartComponent(driver);
        homePageComponent = new HomePageComponent(driver);
        productsComponents = new ProductsComponents(driver);
        productComponent = new ProductComponent(driver);
        loader = new LoaderL(driver);
    }

//    @Test
//    public void loginCompleto() {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://www.advantageonlineshopping.com/");
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@class='loader']"), "style", "display: none; opacity: 0;"));
//        WebElement buttonLogin = driver.findElement(By.xpath("//a[@id='menuUserLink']"));
//        buttonLogin.click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='PopUp']")));
//        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='username']"));
//        inputUsername.sendKeys("candres28");
//        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='password']"));
//        inputPassword.sendKeys("123456789");
//        WebElement checkRememberMe = driver.findElement(By.xpath("//input[@name='remember_me']"));
//        checkRememberMe.click();
//        WebElement buttonSignIn = driver.findElement(By.xpath("//button[@id='sign_in_btnundefined']"));
//        buttonSignIn.click();
//        WebElement textResult = driver.findElement(By.xpath("//*[@id='signInResultMessage']"));
//        wait.until(ExpectedConditions.attributeToBe(textResult, "class", "or  center invalid"));
//        assertThat(textResult.getText(), is(equalTo("Incorrect user name or password.")));
//    }

//    @Test
//    public void comprarElemento() {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://www.advantageonlineshopping.com/");
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@class='loader']"), "style", "display: none; opacity: 0;"));
//        WebElement openCategory = driver.findElement(By.xpath("//div[@id='speakersImg']"));
//        openCategory.click();
//        WebElement abrirSpeaker = driver.findElement(By.xpath("//img[@id='24']"));
//        abrirSpeaker.click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='ng-scope']")));
//        for (int i = 0; i < 54; i++) {
//            WebElement sumarItem = driver.findElement(By.xpath("//div[@class='plus']"));
//            sumarItem.click();
//        }
//        WebElement selectColor = driver.findElement(By.xpath("//span[@title='BLACK' and @id='bunny']"));
//        selectColor.click();
//        WebElement addCart = driver.findElement(By.xpath("//button[@name='save_to_cart']"));
//        addCart.click();
//
//    }

//    @Test
//    public void buyElement() {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://www.advantageonlineshopping.com/");
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@class='loader']"), "style", "display: none; opacity: 0;"));
//        WebElement buttonLogin = driver.findElement(By.xpath("//a[@id='menuUserLink']"));
//        buttonLogin.click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='PopUp']")));
//        WebElement buttonCreateNewAccount = driver.findElement(By.xpath("//a[text()='CREATE NEW ACCOUNT']"));
//        buttonCreateNewAccount.click();
//    }

//    @Test
//    public void loginCompleto() {
//        LoginComponent loginComponent = new LoginComponent(driver);
//        String username = "candres";
//        String password = "c1234A";
//        String category = "SPEAKERS";
//        String article = "HP Roar Mini Wireless Speaker";
//        int quantity = 10;
//        String color = "YELLOW";
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://www.advantageonlineshopping.com/");
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@class='loader']"), "style", "display: none; opacity: 0;"));
//        WebElement buttonLogin = driver.findElement(By.xpath("//a[@id='menuUserLink']"));
//        buttonLogin.click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='PopUp']")));
//
//        loginComponent.ingresarUsuario("candres");
//        loginComponent.ingresarPassword("c1234A");
//
//        WebElement checkRememberMe = driver.findElement(By.xpath("//input[@name='remember_me']"));
//        checkRememberMe.click();
//        WebElement buttonSignIn = driver.findElement(By.xpath("//button[@id='sign_in_btnundefined']"));
//        buttonSignIn.click();
//        wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@class='PopUp']"), "style", "display: none;"));
//        WebElement carrito = driver.findElement(By.xpath("//a[@id='shoppingCartLink']"));
//        Actions action = new Actions(driver);
//        action.moveToElement(carrito).build().perform();
//        wait.until(ExpectedConditions.attributeContains(By.id("toolTipCart"), "style", "block"));
//        try {
//            List<WebElement> equisProducts = driver.findElements(By.xpath("//div[@icon-x]"));
//            for (int i = equisProducts.size() - 1; i >= 0; i--) {
//                equisProducts.get(i).click();
//            }
//        } catch (NoSuchElementException e) {
//
//        } finally {
//
//        }
//        WebElement openCategory = driver.findElement(By.xpath("//span[text()='" + category + "']"));
//        openCategory.click();
//        wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@id='virtualFooter']"), "style", "display: block; position: relative; height: 380px; width: 100%;"));
//        WebElement abrirSpeaker = driver.findElement(By.xpath("//a[text()='" + article + "']"));
//        abrirSpeaker.click();
//        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='ng-scope']")));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='loader']")));
//        wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@class='loader']"), "style", "display: none; opacity: 0;"));
//        for (int i = 1; i < quantity; i++) {
//            WebElement sumarItem = driver.findElement(By.xpath("//div[@class='plus']"));
//            sumarItem.click();
//        }
//        WebElement selectColor = driver.findElement(By.xpath("//span[@title='" + color + "' and @id='bunny']"));
//        selectColor.click();
//        WebElement addCart = driver.findElement(By.xpath("//button[@name='save_to_cart']"));
//        addCart.click();
//        String variable = driver.findElement(By.xpath("//h2[@class='roboto-thin screen768 ng-binding']")).getText();
//        String removePrice = variable.replace("$", "").replace(",", "");
//        double total = Double.parseDouble(removePrice) * quantity;
//        WebElement openCart = driver.findElement(By.xpath("//button[@id='checkOutPopUp']"));
//        openCart.click();
//        wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@id='virtualFooter']"), "style", "display: block; position: relative; height: 380px; width: 100%;"));
//        WebElement textResult = driver.findElement(By.xpath("//p[@class='price roboto-regular ng-binding']"));
//        String priceResult = textResult.getText();
//        String removePriceResult = priceResult.replace("$", "").replace(",", "");
//        double totalPrice = Double.parseDouble(removePriceResult);
//        assertThat(Math.rint(totalPrice * 100) / 100, Matchers.is(Matchers.equalTo(Math.rint(total * 100) / 100)));
//    }


    @Test
    public void comprarPF() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://biz-tm01.eastus2.cloudapp.azure.com/bizagigod/#");

        headerComponent.ingresarUsuario();


       /* loginComponentPF.esperarQueCarguePopUp();
        loginComponentPF.escribirUsuario("candres");
        loginComponentPF.escribirPassword("c1234A");
        loginComponentPF.aceptarRememberMe();
        loginComponentPF.clickSignIn();
        loginComponentPF.esperarQueOcultePopUp();

        shoppingCartComponent.deleteProducts();
        homePageComponent.selectCategory(category);

        productsComponents.esperarVirtualFooter();
        productsComponents.selectProducts(article);

        productComponent.mostrarOculteLoader();

        productComponent.selectColor(color);
        productComponent.incrementarCantidad(quantity);
        productComponent.addCart();
        productComponent.shoppingCart(quantity);*/
    }
}
