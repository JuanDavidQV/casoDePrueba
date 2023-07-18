package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static useriterfaces.PaginaPrincipalPage.*;

public class BuscarHotel implements Task {





    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_CHECKIN),
                Click.on(BTN_CHECKINDIA),
                Click.on(BTN_CHECKOUT),
                Click.on(BTN_CHECKOUTDIA),
                Click.on(BTN_ROOM),
                Click.on(BTN_ROOMCANT),
                Click.on(BTN_ADULT),
                Click.on(BTN_ADULT),
                Click.on(BTN_CHILDREN),
                Click.on(BTN_CHILDREN),
                Click.on(BTN_SEARCH)
        );


    }

    public static BuscarHotel conParametros() {

        return instrumented(BuscarHotel.class);
    }
}
