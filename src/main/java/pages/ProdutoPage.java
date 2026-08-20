package pages;

import org.openqa.selenium.By;

import modelo.Carrinho;
import modelo.Produto;

public class ProdutoPage extends BasePage{

	private By btnCart = By.id("com.saucelabs.mydemoapp.android:id/cartBt");
	
	private By lblProduto = By.id("com.saucelabs.mydemoapp.android:id/productTV");
	private By lblValor = By.id("com.saucelabs.mydemoapp.android:id/priceTV");
	/*
	Sem identificador para destinguir o estado da avaliação	
	private By imgAvaliacao ; 
	No carrinho não tem a descrição da cor ou outro atributo para confrontar
	private By imgCor = By.xpath("//android.widget.ImageView[@resource-id=\"com.saucelabs.mydemoapp.android:id/colorIV\" and @index=1]");
	*/
	Produto produto = new Produto();

	
	public void adicionarCarrinho() {
		click(btnCart);
		
		
		String dscProduto = waitVisible(lblProduto).getText();
		String valProduto = waitVisible(lblValor).getText();
		//String corProduto = waitVisible(imgCor).getAttribute("content-desc");
		
		//Incluir lista
		produto.nmProduto(dscProduto).valorProduto(valProduto);
		Carrinho.incluirCarrinho(produto);
		
	}
	
	
	
}
