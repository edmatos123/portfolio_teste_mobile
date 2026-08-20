package modelo;

public class Produto {

	//Propriedades do produto
	private String nmProduto;
	private String valorProduto;
		
	
	public Produto nmProduto(String nmProduto) {
		this.nmProduto = nmProduto;
		return this;
	}
	
	public Produto valorProduto(String valorProduto) {
		this.valorProduto = valorProduto;
		return this;
	}

	public String getNmProduto() {
		return nmProduto;
	}

	public String getValorProduto() {
		return valorProduto;
	}

	
	
			
	
}
