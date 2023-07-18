package stepdefinitions;


import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.IngresarLogin;
import useriterfaces.PaginaPrincipalPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CasoDePruebaStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;

    private PaginaPrincipalPage paginaPrincipalPage = new PaginaPrincipalPage();
    private Actor actor = new Actor("");

    @Dado("^que ingreso al sitio web$")
    public void ingresarNavegador() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(paginaPrincipalPage)
        );

    }
    @Cuando("^seleccione el logueo e ingrese mi usuario (pruebas@gmail.com) y seleccione cancelar$")
    public void seleccionarCancelar2(String correo) {
        actor.wasAbleTo(IngresarLogin.conDatos(correo));
    }


    @Entonces("^se cerrará el cuadro del login$")
    public void validarCancelacion() {
//        actor.should(seeThat(GivenWhenThen.seeThat(
//
//        ));
    }
}
