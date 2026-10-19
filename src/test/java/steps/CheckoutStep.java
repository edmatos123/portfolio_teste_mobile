package steps;

import dado.UsuarioFalso;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modelo.Checkout;
import pages.CarrinhoPage;
import pages.PageCheckoutEndereco;
import pages.PageCheckoutPagamento;
import pages.PageCheckoutRevisao;
import validation.CheckoutValidation;

public class CheckoutStep {
	
	PageCheckoutEndereco telaCheckoutEndereco = new PageCheckoutEndereco();
	PageCheckoutPagamento telaCheckoutPagamento = new PageCheckoutPagamento();
	PageCheckoutRevisao telaCheckoutRevisao = new PageCheckoutRevisao();
	CheckoutValidation checkoutValidacao = new CheckoutValidation();	
	UsuarioFalso dados = new UsuarioFalso();
	CarrinhoPage telaCarrinho = new CarrinhoPage();
			
	@When("realizo o checkout")
	public void realizo_o_checkout() {
		
		Checkout dadosUsuario = dados.criarUsuarioCompleto();
		
		/*Clicar em Checkout*/
		telaCarrinho.clicarCheckout();		
		/*Preencher Endereço*/		
		telaCheckoutEndereco.preencherDadosEndereco(dadosUsuario.getName(), dadosUsuario.getEndereco(), dadosUsuario.getCidade(), dadosUsuario.getCep(), dadosUsuario.getPais());
		/*Preenhcer Pagamento*/	
		telaCheckoutPagamento.preencherDadosPagamento();
		/*Review your ordem*/
		telaCheckoutRevisao.confirmarPedido();
		
	}
	@Then("O Checkout é feito com sucesso")
	public void o_checkout_é_feito_com_sucesso() {
	 
		/*VALIDAR MENSAGEM DE SUCESSO*/
		checkoutValidacao.validarCheckoutCompleto();
	}
	

}
