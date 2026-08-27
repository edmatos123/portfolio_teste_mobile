@CT01
Feature: Sauce Labs
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
  
@CT03
Scenario: CT03 - Incluir produto no carrinho

  Given que o aplicativo foi aberto
  And seleciono o produto "Sauce Labs Backpack (violet)"
  When adiciono no carrinho   
  Then o produto e exibido no carrinho
  

  