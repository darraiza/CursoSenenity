package com.automation.web.step;

import com.automation.web.page.CsvPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CsvSteps {
    //ALT + ENTER para crear steps
    CsvPage csvpage;

    @Given("el usuario ingresa a la pagina TollSqa")
    public void elUsuarioIngresaALaPaginaTollSqa() {
       csvpage.open();
    }

    @When("ingresamos la data")
    public void ingresamosLaData() {
        csvpage.ingresarDatos();
    }
}
