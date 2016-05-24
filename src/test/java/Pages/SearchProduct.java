package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchProduct extends AbstractPage{



    public SearchProduct(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void SearchProduct()
    {
        driver.findElement(By.linkText("Антивирусные программы")).click();
        driver.findElement(By.id("pricemin")).sendKeys("100000");
        driver.findElement(By.id("pricemax")).sendKeys("1000000");
        driver.findElement(By.name("producers[]")).click();
        driver.findElement(By.name("el_17941[]")).click();
        driver.findElement(By.name("submitbutton")).click();

    }

    public boolean isSearchProduct(){
        boolean serInIsTrue=false;
        if(driver.findElement(By.xpath(".//*[text()='Сравнить все цены']/..")).isDisplayed() ) serInIsTrue=true;
        driver.quit();
        return  serInIsTrue;
    }


}