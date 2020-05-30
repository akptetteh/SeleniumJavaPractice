package com.syntax.utils;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CommonMethods extends BaseClass {
        /**
         * Method that clears and sends keys
         * @param element
         * @param text
         */
        public static void sendAlertText(WebElement element,String text) {
            element.clear();
            element.sendKeys(text);
        }
        /**
         * Method checks if radio/check-box is enabled and click it
         * @param radioOrcheckbox
         * @param value
         */
        public static void clickRadioOrCheckbox(List<WebElement>radioOrcheckbox,String value) {
            String actualValue;
            for( WebElement el:radioOrcheckbox) {
                actualValue=el.getAttribute("value").trim();
                if( el.isEnabled() && actualValue.equals(value)) {
                    el.click();
                    break ;             
                }
            }
        }
        /**
         * Method that checks if text is there and then selects it
         * @param element
         * @param textToSelect
         */
        public static void selectDdValue(WebElement element, String textToSelect) {
            
            try {
            Select select=new Select(element);
            List<WebElement>options=select.getOptions();
            
            for(WebElement el:options) {
                if(el.getText().equals(textToSelect)) {
                    select.selectByVisibleText(textToSelect);
                    break;
                }
            }
            }catch(UnexpectedTagNameException e) {
                e.printStackTrace();                
            }       
        }
        /**
         * Method that selects value by Index
         * @param element
         * @param index
         */
        public static void selectDdValue(WebElement element, int index) {
            try {
                Select select=new Select(element);
                int size=select.getOptions().size();
            if(size>index) {
                select.selectByIndex(index);
            }               
        }catch(UnexpectedTagNameException e) {
            e.printStackTrace();        
        }
        }
        /**
         * Methods that accept alerts and catches exception is alert is not present
         */
        public static void acceptAlert() {
            try {
                Alert alert=driver.switchTo().alert();
                alert.accept();
            }   catch(NoAlertPresentException e) {
                e.printStackTrace();        
            }
        }
        /**
         * Methods dismisses alert and catches exception is alert is not present
         */
        public static void dismissAlert() {
            try {
                Alert alert=driver.switchTo().alert();
                alert.dismiss();
            }catch(NoAlertPresentException e) {
                e.printStackTrace();        
            }
        }
        /**
         * Method that sends text of alert and catches exception is alert is not present
         * @return
         */
        public static String getAlertText() {
            String alertText = null;        
            try {
                Alert alert=driver.switchTo().alert();
            alertText= alert.getText();
            }catch(NoAlertPresentException e) {
            e.printStackTrace();    
            }   
        
            return alertText;
        }
        
        public static void switchToFrame(String nameOrId) {
    
            try {
                driver.switchTo().frame(nameOrId);
            }catch(NoSuchFrameException e) {
                e.printStackTrace();    
        
    }
    
}
        public static void switchToFrame(WebElement element) {
            try {
                driver.switchTo().frame(element);
            }catch(NoSuchFrameException e) {
                e.printStackTrace();
            }
        }
            public static void switchToFrame(int index) {
                try {
                    driver.switchTo().frame(index);
                }catch(NoSuchFrameException e) {
                    e.printStackTrace();
                }
            }
            public static WebDriverWait getWaitObject() {
                WebDriverWait wait=new WebDriverWait(driver,Constants.EXPLICIT_WAIT_TIME);
                return wait;
            }
            public static WebElement waitForClickability(WebElement element) {
                return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
                
                }
            public static JavascriptExecutor getJSObject() {
                JavascriptExecutor js=(JavascriptExecutor)driver;
            return js;
            }
            public static void jsClick(WebElement element) {
                //element may represent array of elements
                getJSObject().executeScript("argument[0].click() ;", element);
                element.click();
                
            }
            public static Boolean waitForVisibility(WebElement element) {
            	return getWaitObject().until(ExpectedConditions.invisibilityOf(element));
            }
            
            public static void scrollToElement(WebElement element) {
                getJSObject().executeScript("arguments[0].scrollIntoView(true);", element);
            
            }
            /**
             * Method that will scroll the page down based on the passed pixel parameters
             * @param pixel
             */
            public static void scrollDown(int pixel) {
                getJSObject().executeScript("window.scrollBy(0,"+pixel+")");
            }
            /**
             * Method that will scroll the page up based on the passed pixel parameters
             * @param pixel
             */
            public static void scrollUp(int pixel) {
                getJSObject().executeScript("window.scrollBy(0,-"+pixel+")");
            }
             public static void click(WebElement loginBtn) {
                    // TODO Auto-generated method stub
            }
	     public void LoginPageElememts() {
                    
                }
	     public static void wait(int second) {
	 		try {
	 			Thread.sleep(second*1000);
	 		}catch(InterruptedException e) {
	 			e.printStackTrace();
	 		
	 		}
	 		
	 	}
	 }