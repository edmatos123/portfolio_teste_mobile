Feature: Sauce Labs

@CT01
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
  And acesso o carrinho
  Then o produto e exibido no carrinho
  
@CT04
Scenario: CT04 - Checkout Produto

  Given que o aplicativo foi aberto
  And acesso o menu login
  And realizo o login valido
  And seleciono o produto "Sauce Labs Backpack (violet)"
  When adiciono no carrinho
  And acesso o carrinho
  And o produto e exibido no carrinho
  And realizo o checkout
  Then O Checkout é feito com sucesso