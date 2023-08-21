package co.com.ejercicio.software.cart;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Form {
  public static Performable login(String username, String password) {
        return Task.where(
                        Enter.theValue(username).into(Login.USERNAME),
                        Enter.theValue(password).into(Login.PASSWORD)
                )
                .with("username").of(username)
                .with("password").of(password);

    }

    public static Performable continueLogin(){
        return Click.on(Login.CONTINUE_LOGIN);
    }

    public static Performable selectProducts1(){
        return
                Click.on(Products.PRODUCT1);
    }

    public static Performable selectProducts2(){
        return
                Click.on(Products.PRODUCT2);
    }

    public static Performable viewCart(){
        return Click.on(Products.VIEW_CART);
    }

    public static Performable checkout(){
        return Click.on(Products.CHECKOUT);
    }

    public static Performable formulario(String firstName, String lastName, String postalCode) {
        return Task.where(
                        Enter.theValue(firstName).into(Formulario.FIRSTNAME),
                        Enter.theValue(lastName).into(Formulario.LASTNAME),
                        Enter.theValue(postalCode).into(Formulario.POSTALCODE)
                )
                .with("firstName").of(firstName)
                .with("lastName").of(lastName)
                .with("postalCode").of(postalCode);

    }

    public static Performable continuar(){
        return Click.on(Formulario.CONTINUE);
    }

    public static Performable finalizar(){
        return Click.on(Formulario.FINISH);
    }

}
