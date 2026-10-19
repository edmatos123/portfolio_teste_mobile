package modelo;

public class Checkout {
	
	private String name, endereco, cidade, cep, pais;
		
	//CRIAR METOSOS BIELD	
	public Checkout name(String name) {
		
		 this.name = name;
		return this;
	}
		

	public String getName() {
		return name;
	}


	public String getEndereco() {
		return endereco;
	}


	public String getCidade() {
		return cidade;
	}


	public String getCep() {
		return cep;
	}


	public String getPais() {
		return pais;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public Checkout endereco(String endereco) {
		
		 this.endereco = endereco;
		return this;
	}
	
	
	public Checkout cidade(String cidade) {
		
		 this.cidade = cidade;
		return this;
	}
	
	public Checkout cep(String cep) {
		
		 this.cep = cep;
		return this;
	}
	
	public Checkout pais(String pais) {
		
		 this.pais = pais;
		return this;
	}

}
