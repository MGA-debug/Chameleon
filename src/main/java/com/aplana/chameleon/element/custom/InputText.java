package com.aplana.chameleon.element.custom;

import com.aplana.chameleon.elements.selenium.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputText extends WebElementFacade {
    public InputText(WebElement element, String elementName, int waitTimeOut, String driverId) {
        super(element, elementName, waitTimeOut, driverId);
    }

    @Override
    public String getErrorMsg() {
        return null;
    }

    @Override
    public String getLabel() {
        return null;
    }

    @Override
    public String getPlaceholder(){
        getWrappedElement().findElement(By.xpath("./../../div[@data-marker='Fieldset.value.Error']")).getText();


//        return getAttribute("placeholder");
        return getWrappedElement().findElement(By.xpath("./../../div[@data-marker='Fieldset.value.Error']")).getText();
    }
}
