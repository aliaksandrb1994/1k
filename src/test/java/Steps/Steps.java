package Steps;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;




public class Steps {
    private WebDriver driver;
    public void initBrowser()
    {
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


    public void closeDriver()
    {
        driver.close();
    }

    public void logInSecond(String username, String password)
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage("http://1k.by");
        loginPage.logIn(username, password);
    }
    public boolean isLoggedIn()
    {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.isLogIn());
    }
    public void logOutSecond(String username, String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage("http://1k.by");
        loginPage.logOut(username,password);
    }
    public boolean isLoggedOut()
    {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.isLogOut());
    }
    public void changePassorwd(String username, String password)
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage("http://1k.by");
        loginPage.changePassorwd(username, password);
    }
    public boolean ischangePassorwd()
    {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.ischangePassorwd());
    }
    public void SearchSecond(String searcword){
        Search search = new Search(driver);
        search.openPage("http://1k.by");
        search.Search(searcword);
    }
    public boolean isSearched()
    {
        Search search = new Search(driver);
        return (search.isSearch());
    }
    public void SearchProduct(){
        SearchProduct search = new SearchProduct(driver);
        search.openPage("http://1k.by");
        search.SearchProduct();
    }
    public boolean isSearchProduct()
    {
        SearchProduct search = new SearchProduct(driver);
        return (search.isSearchProduct());
    }
    public void ChangeSettings(){
        ChangeSettings change = new ChangeSettings(driver);
        change.openPage("http://1k.by/users/setgeo");
        change.ChangeSettings();
    }
    public boolean isChangeSettings()
    {
        ChangeSettings change = new ChangeSettings(driver);
        return (change.isChangeSettings());
    }

    public void Comparison(){
        Comparison comparison = new Comparison(driver);
        comparison.openPage("http://1k.by");
        comparison.Comparison();
    }
    public boolean isComparison()
    {
        Comparison comparison = new Comparison(driver);
        return (comparison.isComparison());
    }

}


