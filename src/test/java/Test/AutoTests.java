package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Steps.Steps;

public class AutoTests {
    private Steps steps;
    private final String USERNAME = "+375255444152  ";
    private final String PASSWORD = "5444152Aa";
    private final String searchworld = "AMD";




    @BeforeMethod(description = "Init Browser")
    public void setUp(){
        steps=new Steps();
        steps.initBrowser();
    }

    //вход
    @Test(description = "Login to 1k.by")
    public void logInSecond() {
        steps.logInSecond(USERNAME, PASSWORD);
        Assert.assertTrue(steps.isLoggedIn());
        System.out.println("Login to 1k.by");
    }
    //выход
    @Test(description = "LogOut to 1k.by")
    public void logOutSecond(){
        steps.logOutSecond(USERNAME, PASSWORD);
        Assert.assertTrue(steps.isLoggedOut());
        System.out.println("LogOut to 1k.by");
    }
    //изменение пароля
    @Test(description = "changePassorwd 1k.by")
    public void changePassorwd(){
        steps.changePassorwd(USERNAME, PASSWORD);
        Assert.assertTrue(steps.ischangePassorwd());
        System.out.println("changePassorwd 1k.by");
    }

    //поиск
    @Test(description = "Search 1k.by")
    public void SearchSecond(){
        steps.SearchSecond(searchworld);
        Assert.assertTrue(steps.isSearched());
        System.out.println("Search 1k.by");
    }

    //поиск продукта
    @Test(description = "SearchProduct 1k.by")
    public void SearchProduct(){
        steps.SearchProduct();
        Assert.assertTrue(steps.isSearchProduct());
        System.out.println("SearchProduct 1k.by");
    }
    //изменение настроек
    @Test(description = "ChangeSettings 1k.by")
    public void ChangeSettings(){
        steps.ChangeSettings();
        Assert.assertTrue(steps.isChangeSettings());
        System.out.println("ChangeSettings 1k.by");
    }
    //сравнение продуктов
    @Test(description = "Comparison 1k.by")
    public void Comparison(){
        steps.Comparison();
        Assert.assertTrue(steps.isComparison());
        System.out.println("Comparison 1k.by");
    }

}
