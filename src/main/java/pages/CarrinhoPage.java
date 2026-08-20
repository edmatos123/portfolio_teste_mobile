package pages;

import org.openqa.selenium.By;

import modelo.Produto;

public class CarrinhoPage extends BasePage {
	
	
	private By lblProduto = By.id("com.saucelabs.mydemoapp.android:id/titleTV");
	private By lblValor = By.id("com.saucelabs.mydemoapp.android:id/priceTV");

	
	
	public boolean validarCompatibilidadeProduto(Produto produto) {
		String dscProduto = waitVisible(lblProduto).getText();
		String valProduto = waitVisible(lblValor).getText();
		
		if(produto.getNmProduto().equals(dscProduto) && produto.getValorProduto().equals(valProduto)) {
			return true;
		}else {
			return false;
		}
			
		
		
		
	}
	
	
}
