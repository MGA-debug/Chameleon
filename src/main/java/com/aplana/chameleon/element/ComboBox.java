package com.aplana.chameleon.element;

import com.aplana.chameleon.elements.selenium.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComboBox extends WebElementFacade {
    public ComboBox(WebElement element, String elementName, int waitTimeOut, String driverId) {
        super(element, elementName, waitTimeOut, driverId);
    }

    public void type(String value){
    getDriver().executeScript("return arguments[0].scrollIntoView(false)",getWrappedElement());
    new WebDriverWait(getDriver(),5)
            .until(ExpectedConditions.elementToBeClickable(getWrappedElement())).click();
    getWrappedElement().findElement(By.xpath("//*[contains(text(),'"+value+"')]")).click();
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
