package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageCheckout;
import validation.CheckoutValidation;

public class CheckoutStep {
	
	PageCheckout telaCheckout = new PageCheckout();
	CheckoutValidation checkoutValidacao = new CheckoutValidation();
			
	@When("realizo o checkout")
	public void realizo_o_checkout() {

		/*Preencher Endereço*/		
		/*Preenhcer Pagamento*/		
		/*Review your ordem*/	
		
	}
	@Then("O Checkout é feito com sucesso")
	public void o_checkout_é_feito_com_sucesso() {
	 
		/*VALIDAR MENSAGEM DE SUCESSO*/
		
	}
	

}
