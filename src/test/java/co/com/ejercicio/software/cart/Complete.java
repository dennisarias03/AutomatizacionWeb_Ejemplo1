package co.com.ejercicio.software.cart;

import net.serenitybdd.screenplay.questions.Text;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ensure.Ensure;


public class Complete {

    public static final Target COMPLETE_HEADER = Target
            .the("complete header")
            .locatedBy("//h2[@class='complete-header']");

    public static void verifyThankYouMessage(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of(COMPLETE_HEADER)).isEqualTo("Thank you for your order!")
        );
    }
}
