package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage{

    @FindBy(linkText = "Войти")
    public WebElement signInentrance;

    @FindBy(className = "social-sign_fb")
    public WebElement signinFacbook;

    @FindBy(id = "email")
    public WebElement signInLogin;

    @FindBy(id = "pass")
    public WebElement signInPassword;

    @FindBy(id = "loginbutton")
    public WebElement signInLoginbutton;

    public LoginPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void logIn(String username, String password)
    {
        signInentrance.click();
        signinFacbook.click();
        signInLogin.clear();
        signInLogin.sendKeys(username);
        signInPassword.clear();
        signInPassword.sendKeys(password);
        signInLoginbutton.click();
    }


    public void logOut(String username, String password){
        signInentrance.click();
        signinFacbook.click();
        signInLogin.clear();
        signInLogin.sendKeys(username);
        signInPassword.clear();
        signInPassword.sendKeys(password);
        signInLoginbutton.click();
        driver.findElement(By.linkText("Выход")).click();
    }

    public void changePassorwd(String username, String password)
    {
        signInentrance.click();
        signinFacbook.click();
        signInLogin.clear();
        signInLogin.sendKeys(username);
        signInPassword.clear();
        signInPassword.sendKeys(password);
        signInLoginbutton.click();
        driver.findElement(By.linkText("Befirst.by ()")).click();
        driver.findElement(By.linkText("Мои данные")).click();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("passwordconfirm")).sendKeys(password);
        driver.findElement(By.id("submit")).click();
    }

    public boolean isLogOut(){
        boolean logOutIsTrue=false;
        if(driver.findElement(By.linkText("Войти")).isDisplayed()) logOutIsTrue=true;
        driver.quit();
        return  logOutIsTrue;
    }

    public boolean isLogIn(){
        boolean logInIsTrue=false;
        if(driver.findElement(By.linkText("Выход")).isDisplayed()) logInIsTrue=true;
        driver.quit();
        return  logInIsTrue;
    }

    public boolean ischangePassorwd(){
        boolean logOutIsTrue=false;
        if(driver.findElement(By.xpath(".//*[text()='Данные сохранены!']/..")).isDisplayed()) logOutIsTrue=true;
        driver.quit();
        return  logOutIsTrue;
    }
}