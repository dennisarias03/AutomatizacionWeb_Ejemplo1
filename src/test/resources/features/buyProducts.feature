@buyProducts
Feature: Test Cart

  Scenario : Añadir 2 productos
    Given Denis navegar a la pagina principal
    When llenar login "standard_user", "secret_sauce"
    And Dar click boton login
    When seleccionar primer producto
    And seleccionar segundo producto
    And visualizar productos en el carrito
    And verificar productos
    When llenar formulario "Abc123", "Abc123", "Abc123"
    And Dar click boton continue
    And Dar clic en boton finalizar


    ## REVISAR EL ULTIMO BOTON And Dar click boton continue Y FINALIZAR CON EL MENSAJE
    ## DEBE terminar asi:
    # Then Validar mensaje Then Validar mensaje "Your order has been placed!"