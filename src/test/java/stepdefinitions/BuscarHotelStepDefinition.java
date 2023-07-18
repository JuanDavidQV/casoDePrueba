package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.BuscarHotel;
import tasks.IngresarLogin;
import tasks.IngresarLugar;
import useriterfaces.PaginaPrincipalPage;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
public class BuscarHotelStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private PaginaPrincipalPage paginaPrincipalPage = new PaginaPrincipalPage();
    private Actor actor = new Actor("");

    @Dado("^que ingreso al sitio webb$")
    public void ingresarNavegador2() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(paginaPrincipalPage)
        );

    }
    @Cuando("^seleccione el lugar$")
    public void seleccionarLugar() {
        actor.wasAbleTo(IngresarLugar.buscarLugar());
    }
    @Y("^seleccione los datos con los parametros establecido$")
    public void seleccionarParametros() {
        actor.wasAbleTo(BuscarHotel.conParametros());
    }

    @Entonces("^se debe seleccionar el hotel más económico que cumpla con los filtros$")
    public void validarHoteEconomico() {
        //actor.should(seeThat(the(), isPresent));
    }
}
