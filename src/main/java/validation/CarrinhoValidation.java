package validation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import modelo.Carrinho;
import modelo.Produto;
import pages.CarrinhoPage;


public class CarrinhoValidation {


	CarrinhoPage telaCarrinho = new CarrinhoPage();
	
	public void validarProdutoCarrinho() {				
		List<Produto> produto = Carrinho.obterProdutos();		
		assertTrue(telaCarrinho.validarCompatibilidadeProduto(produto.get(0)),"O Produto não foi incluido corretamente no carrinho!");
		
		
	}
	
	
	
}
