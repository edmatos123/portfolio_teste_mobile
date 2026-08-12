package pages;

import org.openqa.selenium.By;

public class CatalogoProdutosPages extends BasePage{

	private By lblProducts = By.id("com.saucelabs.mydemoapp.android:id/productTV");
	
	
	
	public boolean telaCatalogoVisivel() {
		return isElementVisible(lblProducts);
	}
	
}
