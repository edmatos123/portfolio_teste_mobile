package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.components.MenuComponent;
import validation.CarrinhoValidation;

public class CarrinhoStep {

	MenuComponent menu = new MenuComponent();
	CarrinhoValidation carrinhoValidacao = new CarrinhoValidation();
	
	
	@And("acesso o carrinho")
	public void acesso_o_carrinho() {	
		menu.clickCarrinho();		
	}
	
	@Then("o produto e exibido no carrinho")
	public void o_produto_e_exibido_no_carrinho() {		
		carrinhoValidacao.validarProdutoCarrinho();
	}
	
	
	
}
