@CT01
Feature: Login
Scenario: CT01 - Login valido
  
  Given que o aplicativo foi aberto
  And acesso o menu login
  When realizo o login valido
  Then o acesso e realizado
  
@CT02
Scenario: CT02 - Buscar produto especifico no catalogo

  Given que o aplicativo foi aberto
  When procuro pelo produto "Sauce Labs Fleece Jacket (green)"
  Then o produto "Sauce Labs Fleece Jacket (green)" e encontrado no catalogo