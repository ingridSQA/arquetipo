package co.com.compania.proyecto.stepdefinitions;

import co.com.compania.proyecto.tasks.Ingresa;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;

public class InformacionStepDefinitions {
    @Given("{actor} desea abrir el navegador")
    public void IngridDeseaAbrirElNavegador(Actor actor) {
        actor.attemptsTo(Ingresa.aUrl());
    }
}
