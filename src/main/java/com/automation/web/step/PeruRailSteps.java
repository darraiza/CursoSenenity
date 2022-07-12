package com.automation.web.step;

import com.automation.web.page.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PeruRailSteps {
    HomePage homePage;

    CalendarioPage calendarioPage;
    CabinasPage cabinasPage;

    DataPage dataPage;

    MetodoDePagoPage metodoDePagoPage;

    @When("selecciono el destino {string}, la ruta {string} y seleccionamos el tren {string}")
    public void seleccionoElDestinoLaRutaYSeleccionamosElTren(String destino, String ruta, String tren) {
        homePage.seleccionarDestino(destino);
        homePage.selecdionarRuta(ruta);
        homePage.seleccionarTren(tren);

    }

    @And("selecciona la fecha de salida {string} y {string}")
    public void seleccionaLaFechaDeSalidaY(String mesAnioSalida, String diaSalida) {
        calendarioPage.seleccionarSalida(mesAnioSalida,diaSalida);
        homePage.clickBuscar();
    }

    @And("selecciono el tipo de cabina {string} u la cantidad de canibas {string}")
    public void seleccionoElTipoDeCabinaULaCantidadDeCanibas(String tipoCabina, String cantCabina) {
        cabinasPage.seleccionarCabina(tipoCabina,cantCabina);
        cabinasPage.clickContinur();
    }

    @And("ingresamos la informacion de los pasajeros")
    public void ingresamosLaInformacionDeLosPasajeros(DataTable dataTable) {
        dataPage.listaFormulario(dataTable);
    }

    @When("doy click en continuar en la pagina de pasajeros")
    public void doyClickEnContinuarEnLaPaginaDePasajeros() {
        dataPage.clickContinuar();
    }

    @Then("se mostrara la pantalla de pago {string}")
    public void seMostraraLaPantallaDePago(String tituloPago) {
        Assert.assertEquals(tituloPago, metodoDePagoPage.obtenerTituloPago());
    }

    @And("elegimos como {string} e ingresamos el {string}, {string}, {string}, {string} y {string}")
    public void elegimosComoEIngresamosElY(String metodo_pago, String nro_tarjeta, String mes_expiracion, String anio_expiracion, String codigo_seguridad, String nombre) {
        metodoDePagoPage.clickMetodoPago(metodo_pago);
        metodoDePagoPage.clickTerminos();
        metodoDePagoPage.ingresarDatosTarjeta(nro_tarjeta,mes_expiracion, anio_expiracion,codigo_seguridad,nombre);
    }
}
