package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.lang.annotation.Target;

public class TituloPagina implements Question<String> {
    private Target titulo;

    public TituloPagina(Target titulo) {
        this.titulo = titulo;
    }

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
