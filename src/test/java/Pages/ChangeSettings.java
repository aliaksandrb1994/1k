package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChangeSettings extends AbstractPage{



    public ChangeSettings(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void ChangeSettings()
    {
        driver.findElement(By.name("regionid")).sendKeys("Могилевская обл.");
        driver.findElement(By.name("deliveriestypeids[]")).click();
        driver.findElement(By.name("cityid")).sendKeys("Осиповичи");
        driver.findElement(By.name("submit")).click();

    }

    public boolean isChangeSettings(){
        boolean serInIsTrue=false;
        if(driver.findElement(By.name("submit")).isDisplayed()) serInIsTrue=true;
        driver.quit();
        return  serInIsTrue;
    }


}