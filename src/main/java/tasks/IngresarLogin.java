package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static useriterfaces.PaginaPrincipalPage.*;

public class IngresarLogin implements Task {

    private String correo;
//    private String clave;


    public IngresarLogin(String correo) {
        this.correo = correo;
//        this.clave = clave;

    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_LOGIN),
                Enter.theValue(correo).into(INPUT_CORREO),
//                Enter.theValue(clave).into(INPUT_CLAVE)
                Click.on(BTN_CANCEL)
        );


    }

    public static IngresarLogin conDatos(String correo) {

        return instrumented(IngresarLogin.class, correo);
    }
}
