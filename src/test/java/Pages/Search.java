package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search extends AbstractPage{


    public Search(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void Search(String searcworld)
    {
        driver.findElement(By.id("s_keywords")).clear();
        driver.findElement(By.id("s_keywords")).sendKeys(searcworld);
        driver.findElement(By.id("s_submit")).click();

    }

    public boolean isSearch(){
        boolean serInIsTrue=false;
        if(driver.findElement(By.xpath(".//*[text()='Показывать:']/..")).isDisplayed() ) serInIsTrue=true;
        driver.quit();
        return  serInIsTrue;
    }


}
