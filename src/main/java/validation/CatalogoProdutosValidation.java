package validation;

import static org.junit.jupiter.api.Assertions.assertTrue;
import pages.CatalogoProdutosPages;

public class CatalogoProdutosValidation {

	CatalogoProdutosPages telaCatalogo = new CatalogoProdutosPages();
		
	
	public void validarExibicaoCatalogo() {
		assertTrue(telaCatalogo.telaCatalogoVisivel(),"A tela do Catalogo dos Produtos não foi exibida!");
	}
	
	public void validarExibicaoprodutoCatalogo(String nmProduto) {
		assertTrue(telaCatalogo.telaCatalogoProdutoVisivel(nmProduto),"O Produto não foi encontrado na lista!");
	}
	
}
