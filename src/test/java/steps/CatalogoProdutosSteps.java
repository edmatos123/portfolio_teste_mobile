package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CatalogoProdutosPages;
import pages.components.MenuComponent;
import validation.CatalogoProdutosValidation;

public class CatalogoProdutosSteps {

	CatalogoProdutosValidation catalogoValidacao = new CatalogoProdutosValidation();
	CatalogoProdutosPages telaCatalogo = new CatalogoProdutosPages();
	
	MenuComponent menu = new MenuComponent();
	
	@Given("que o aplicativo foi aberto")
	    public void aplicativoAberto() {
		 catalogoValidacao.validarExibicaoCatalogo();
	    }
	
	@And("acesso o menu login")
	public void acesso_o_menu_login() {
		menu.clickMenu();
		menu.clickLogin();
	}
	
	@When("procuro pelo produto {string}")
	public void procuro_pelo_produto(String nmProduto) {
	   
		telaCatalogo.pesquisarProduto(nmProduto);
	}

	@Then("o produto {string} e encontrado no catalogo")
	public void o_produto_e_encontrado_no_catalogo(String nmProduto) {
		catalogoValidacao.validarExibicaoprodutoCatalogo(nmProduto);
	}

	
	@And("seleciono o produto {string}")
	public void seleciono_o_produto(String nmProduto){
		telaCatalogo.selecionarProduto(nmProduto);		
	}
	 
	
	 
	
	
}
