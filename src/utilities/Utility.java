package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    /**
     * THIS IS WILL CLIck on element
     *
     */
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }
    /**
     * This is  Will send text   to element

     */
    public void sendTextToElement(By by, String text){

        driver.findElement(by).sendKeys(text);
    }
    /**
     * THIS IS WILL get  text  from element

     */
    public  String getTextFromElement(By by){
        return  driver.findElement(by).getText();

    }
    //***********Alert Method***********************
    // Homework Create  5 method
    public void switchToAlert(){
        Alert alert = driver.switchTo().alert();
    }
    public void accept(){
        driver.switchTo().alert().accept();
    }
    public void dismiss(){
        driver.switchTo().alert().dismiss();
    }
    public  void alertGetText() {
        driver.switchTo().alert().getText();
    }
    public void alertSendKeys(String text){
        driver.switchTo().alert().sendKeys(text);

    }




    //**************************Select Method*****************
    public void selectByVisibleTextFromDropDown(By by, String text){
        WebElement dropDown = driver.findElement(by);

        Select select = new Select(dropDown);
        // Select by visible text
        select.selectByVisibleText(text);
    }
    public void selectByValueFromDropDown(By by ,String text){
        WebElement dropDown = driver.findElement(by);

        Select select = new Select(dropDown);
        // Select by visible text
        select.selectByValue(text);

    }
    public void selectByIndexFromDropDown(By by,int index){
        WebElement dropDown = driver.findElement(by);

        Select select = new Select(dropDown);
        // Select by visible index
        select.selectByIndex(index);

    }
}


