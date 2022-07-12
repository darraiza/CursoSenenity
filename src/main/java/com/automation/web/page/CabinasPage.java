package com.automation.web.page;

import com.automation.utils.Util;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CabinasPage extends PageObject {

    Util util;

    @FindBy(name = "selectRooms[suite]")
    private WebElementFacade tipoSuite;

    @FindBy(name = "selectRooms[twin]")
    private WebElementFacade tipoWin;

    @FindBy(name = "selectRooms[bunk]")
    private WebElementFacade tipoBunk;

    @FindBy(xpath = "//div[@class='cont-select children']//select")
    private List<WebElementFacade> cantNinios;

    @FindBy(id = "continuar_bae")
    private WebElementFacade btnContinuar;


    @FindBy(className = "sb-content")
    private WebElementFacade popUp;


// otra forma de identificar elementos
    public void seleccionarCabina(String tipoCabina, String numeroCabina) {

        $("//div[@class='contenedor']").waitUntilVisible();
        WebElementFacade webElementFacade = null;
        switch (tipoCabina) {
            case "SUITE":
                webElementFacade = tipoSuite;
                break;
            case "TWIN":
                webElementFacade = tipoSuite;
                break;
            case "BUNK":
                webElementFacade = tipoSuite;
                break;
        }
        //scroll chrome
        //withAction().moveToElement(webElementFacade).perform();

        //scroll firefox
        util.scrollToElement(webElementFacade);

        //validación
        assert webElementFacade != null;
        // si texto es viisble
        webElementFacade.selectByVisibleText(numeroCabina);
    }


            public void seleccionarCantidadNinios(String cantidad){
                int cant = cantNinios.size();
                System.out.println("cantidad de ninios" + cant);
                for (WebElementFacade ele:cantNinios){
                ele.selectByVisibleText(cantidad);
            }


    }


    public void clickContinur(){
      //  withAction().moveToElement(btnContinuar).perform();
        util.scrollToElement(btnContinuar);
        btnContinuar.click();
    }

    public String ObtenerTextoPopUp(){
        return popUp.getText();
    }

}
