package com.automation.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.interactions.Actions;

public class Util extends PageObject {

    public boolean scrollToElement(WebElementFacade element) {
        try {
            evaluateJavascript("argument[0].scrollIntoView(true)", element);
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    //permite digitar al calemdario sin seleccionar
    public boolean getReadOnly(WebElementFacade element) {
        try {
            evaluateJavascript("arguments[0].removeAttribute('readonly','readonly')", element);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //click en pantalla
    public void clickOutside() {
        Actions action = new Actions(getDriver());
        action.moveByOffset(0, 0).click().build().perform();
    }


}
