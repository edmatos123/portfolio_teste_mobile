package modelo;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	
	private static List<Produto> produtos = new ArrayList<>();
	
	//Metodo para remocão do vetor
	public static void incluirCarrinho(Produto produto) {
		produtos.add(produto);
	}
	
	
	//Metodo para obtencao de dados do vetor 
	public static List<Produto> obterProdutos(){
		return produtos;
	}
	
}
