package com.automation.web.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CalendarioPage extends PageObject {

    @FindBy(id = "salida")
    private WebElementFacade btnFechaSalida;

    @FindBy(className = "ui-datepicker-title")
    private WebElementFacade mesAnio;





}
