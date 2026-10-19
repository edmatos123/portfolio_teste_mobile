package steps;

import io.cucumber.java.en.When;
import pages.ProdutoPage;

public class ProdutoSteps {

	ProdutoPage telaProdutos = new ProdutoPage();
	
	
	@When("adiciono no carrinho")
	public void adiciono_no_carrinho() {
		telaProdutos.adicionarCarrinho();
	}
	
	
	
}
