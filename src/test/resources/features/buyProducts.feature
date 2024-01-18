@buyProducts
Feature: Test Cart

  Scenario Outline: Añadir 2 productos
    Given Denis navegar a la pagina principal
    When llenar login "<user>" , "<pass>"
    And Dar click boton login
    When seleccionar primer producto
    And seleccionar segundo producto
    And visualizar productos en el carrito
    And verificar productos
    When llenar formulario "<address>", "<city>", "<zipcode>"
    And Dar click boton continue
    And Dar clic en boton finalizar
    Then Visualiza mensaje Thank you for your order!
    Examples:
      | user          | pass         | address                  | city  | zipcode |
      | standard_user | secret_sauce | Av. Universitaria 23-55  | Loja  | 11055   |