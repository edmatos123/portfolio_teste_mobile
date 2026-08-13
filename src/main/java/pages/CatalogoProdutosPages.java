package pages;

import org.openqa.selenium.By;

public class CatalogoProdutosPages extends BasePage{

	private By lblProducts = By.id("com.saucelabs.mydemoapp.android:id/productTV");
	private By LayoutSocial = By.id("com.saucelabs.mydemoapp.android:id/socialLL");	
	private By lblProduto;
	private String xpathProduto = "//android.widget.TextView[@content-desc='Product Title' and @text='%s']";
	
	
	public boolean telaCatalogoVisivel() {
		return isElementVisible(lblProducts);
	}
	
	public boolean telaCatalogoProdutoVisivel(String nmProduto) {
		/*lblProduto = By.xpath(
		        "//android.widget.TextView[@content-desc='Product Title' and @text='" 
		                + nmProduto + "']");*/
		
		lblProduto = By.xpath(String.format(xpathProduto, nmProduto));
		
		return isElementVisible(lblProduto);
	}
	
	public void pesquisarProduto(String nmProduto) {
		
		/*lblProduto = By.xpath(
		        "//android.widget.TextView[@content-desc='Product Title' and @text='" 
		                + nmProduto + "']");*/
		lblProduto = By.xpath(String.format(xpathProduto, nmProduto));

		
		findUntilEnd(lblProduto,LayoutSocial);	
		
		
	}
	
	
	
}
