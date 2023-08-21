package co.com.ejercicio.software.cart;

import org.openqa.selenium.By;

public class Products {
    public static By PRODUCT1 = By.name("add-to-cart-sauce-labs-backpack");

    public static By PRODUCT2 = By.id("add-to-cart-sauce-labs-bike-light");

    public static By VIEW_CART = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span");

    public static By CHECKOUT = By.id("checkout");
}
