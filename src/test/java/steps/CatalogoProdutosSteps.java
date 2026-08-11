package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import validation.CatalogoProdutosValidation;

public class CatalogoProdutosSteps {

	CatalogoProdutosValidation catalogoValidacao = new CatalogoProdutosValidation();
	
	@Given("que o aplicativo foi aberto")
	    public void aplicativoAberto() {
		 catalogoValidacao.validarExibicaoCatalogo();
	    }
	
	@And("acesso o menu login")
	public void acesso_o_menu_login() {
	 
	}
	
	
	 
	
	 
	
	
}
