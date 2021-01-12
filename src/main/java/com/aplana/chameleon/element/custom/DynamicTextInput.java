package com.aplana.chameleon.element.custom;

import com.aplana.chameleon.elements.selenium.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTextInput extends WebElementFacade {

    public DynamicTextInput(WebElement element, String elementName, int waitTimeOut, String driverId) {
        super(element, elementName, waitTimeOut, driverId);
    }

    public void type(String value){
        clear();
        sendKeys(value);
        new WebDriverWait(getDriver(),5)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[contains(text(),'"+value+"')]"))).click();
    }

    @Override
    public String getErrorMsg() {
        return null;
    }

    @Override
    public String getLabel() {
        return null;
    }
}
