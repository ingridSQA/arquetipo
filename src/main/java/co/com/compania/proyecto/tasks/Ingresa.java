package co.com.compania.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.compania.proyecto.util.Constantes.URL_PRINCIPAL;

public class Ingresa implements Task {

    public static Ingresa aUrl(){
        return Tasks.instrumented(Ingresa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(URL_PRINCIPAL)
        );
    }
}
