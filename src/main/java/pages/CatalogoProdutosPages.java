package pages;

import org.openqa.selenium.By;

public class CatalogoProdutosPages extends BasePage{

	private By lblProducts = By.id("com.saucelabs.mydemoapp.android:id/productTV");
	private By layoutSocial = By.id("com.saucelabs.mydemoapp.android:id/socialLL");	
	private By imgProduto;
	private By lblProduto;
	
	private String xpathProduto = "//android.widget.TextView[@content-desc='Product Title' and @text='%s']";
	private String xpathImgProduto = "//android.widget.TextView[@text='%s']/ancestor::android.view.ViewGroup[1]//android.widget.ImageView[@content-desc='Product Image']";
	
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

		
		findUntilEnd(lblProduto,layoutSocial);	
		
		
	}
	
	
	public void selecionarProduto(String nmProduto) {	
		
		//lblProduto = By.xpath(String.format(xpathProduto, nmProduto));
		imgProduto = By.xpath(String.format(xpathImgProduto, nmProduto));
		findUntilEnd(imgProduto,layoutSocial);		
		click(imgProduto);
		
	}
	
	
	
}
