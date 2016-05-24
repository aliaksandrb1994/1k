package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Comparison extends AbstractPage{



    public Comparison(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void Comparison()
    {   driver.findElement(By.cssSelector("h3.catalog-nav_title > a")).click();
        driver.findElement(By.linkText("Серверы")).click();
        driver.findElement(By.name("compareproductsids")).click();
        driver.findElement(By.xpath("(//input[@name='compareproductsids'])[2]")).click();
        driver.findElement(By.xpath("(//input[@name='compareproductsids'])[3]")).click();
        driver.findElement(By.xpath("//button")).click();

    }

    public boolean isComparison(){
        boolean serInIsTrue=false;
        if(driver.findElement(By.linkText("ASUS 1U (RS100-E8/PI2)")).isDisplayed()) serInIsTrue=true;
        driver.quit();
        return serInIsTrue;


    }


}