package com.automation.web.step;

import com.automation.web.page.CabinasPage;
import com.automation.web.page.CalendarioPage;
import com.automation.web.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class CabinaSteps {

    HomePage homePage;
    CalendarioPage calendarioPage;

    CabinasPage cabinaPage;

    // ALT + ENTER PARA CREAR STEPS
    @Given("el usuario ingresa a la pagina de PeruRail")
    public void elUsuarioIngresaALaPaginaDePeruRail() {
        homePage.open();
    }

    @And("selecciono el destino, ruta,tren, mes_anio y dia")
    public void seleccionoElDestinoRutaTrenMes_anioYDia() throws InterruptedException {
        homePage.seleccionarDestino("Cusco");
        homePage.selecdionarRuta("Puno > Cusco");
        homePage.seleccionarTren("Andean Explorer, A Belmond Train");
        calendarioPage.seleccionarSalida("September 2022","28");
        homePage.clickBuscar();
        Thread.sleep(20000);
    }

    @And("selecciono {string} del tipo {string} con {int} pasajeros niños")
    public void seleccionoDelTipoConPasajerosNiños(String cant, String cabina , int cantNinios) {
    cabinaPage.seleccionarCabina(cabina,cant);
    cabinaPage.seleccionarCantidadNinios(Integer.toString(cantNinios));

    }

    @When("doy click en continuar en la pagina de cabinas")
    public void doyClickEnContinuarEnLaPaginaDeCabinas() {
        cabinaPage.clickContinur();
    }

    @Then("se mostrara un popup con el mensaje {string}")
    public void seMostraraUnPopupConElMensaje(String mensaje) {
        Assert.assertEquals(mensaje,cabinaPage.ObtenerTextoPopUp());
    }
}
