package co.com.ejercicio.software.stepsDefinitions;

import co.com.ejercicio.software.cart.Complete;
import co.com.ejercicio.software.cart.Form;
import co.com.ejercicio.software.cart.Products;
import co.com.ejercicio.software.navigate.Navigate;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.screenplay.waits.Wait;


public class buysStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) navegar a la pagina principal")
    public void homeCart(String actor) {
        Wait.until(() -> true).forNoMoreThan(10).seconds();
        theActorCalled(actor).attemptsTo(Navigate.OpenHomePage());
    }

    @When("llenar login {string}, {string}")
    public void login(String username, String password){
        Wait.until(() -> true).forNoMoreThan(10).seconds();
        withCurrentActor(
                Form.login(username, password)
        );
    }

    @And("Dar click boton login")
    public void clickOnContinue() {
        Wait.until(() -> true).forNoMoreThan(10).seconds();
        withCurrentActor(
                Form.continueLogin()
        );
    }


    @When ("seleccionar primer producto")
    public void selectProducts1(){
        Wait.until(() -> true).forNoMoreThan(10).seconds();
        withCurrentActor(Form.selectProducts1());
    }

    @And ("seleccionar segundo producto")
    public void selectProducts2(){
        Wait.until(() -> true).forNoMoreThan(10).seconds();
        withCurrentActor(Form.selectProducts2());
    }


    @And ("visualizar productos en el carrito")
    public void viewCart(){
        Wait.until(() -> true).forNoMoreThan(10).seconds();
        withCurrentActor(Form.viewCart());
    }

    @And ("verificar productos")
    public void checkout(){
        Wait.until(() -> true).forNoMoreThan(10).seconds();
        withCurrentActor(Form.checkout());
    }

    @When("llenar formulario {string}, {string}, {string}")
    public void formulario(String firstName, String lastName, String postalCode ){
        Wait.until(() -> true).forNoMoreThan(10).seconds();
        withCurrentActor(

                Form.formulario(firstName, lastName, postalCode)
        );
        Wait.until(() -> true).forNoMoreThan(10).seconds();
    }

    @And("Dar click boton continue")
    public void clickContinue() {
        withCurrentActor(
                Form.continuar()
        );
        Wait.until(() -> true).forNoMoreThan(5).seconds();
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(5)); // Wait for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("Dar clic en boton finalizar")
    public void clickfinish() {
        withCurrentActor(
                Form.finalizar()
        );
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(5)); // Wait for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("llenar login {string} , {string}")
    public void llenarLogin(String arg0, String arg1) {
        withCurrentActor(
                Form.login(arg0, arg1)
        );
        Wait.until(() -> true).forNoMoreThan(5).seconds();
    }

    @Then("Visualiza mensaje Thank you for your order!")
    public void visualizaMensajeThankYouForYourOrder() {

        Complete.verifyThankYouMessage(theActorInTheSpotlight());



    }

}
