package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static useriterfaces.PaginaPrincipalPage.*;

public class IngresarLugar implements Task {

//    private String lugar;
//    public IngresarLugar(String lugar) {
//        this.lugar = lugar;
//
//
//    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LISTA),
                Click.on(BTN_PAIS)
        );
    }
    public static IngresarLugar buscarLugar() {

        return instrumented(IngresarLugar.class);
    }
}
