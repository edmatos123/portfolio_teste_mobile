package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import validation.CatalogoProdutosValidation;

public class LoginSteps {

	
	LoginPage telaLogin = new LoginPage();
	CatalogoProdutosValidation catalogoValidacao = new CatalogoProdutosValidation();
	
	@When("realizo o login valido")
	public void realizo_o_login_valido() {
		telaLogin.fazerLogin();
	}
	
	
	@Then("o acesso e realizado")
	public void o_acesso_e_realizado() {
		catalogoValidacao.validarExibicaoCatalogo();
		
	}
	
	
}
