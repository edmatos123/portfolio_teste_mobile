package pages;

import org.openqa.selenium.By;

public class PageCheckoutPagamento extends BasePage{
	
	private By txtName = By.id("com.saucelabs.mydemoapp.android:id/nameET");
	private By txtNumeroCartao= By.id("com.saucelabs.mydemoapp.android:id/cardNumberET");
	private By txtExpiracao = By.id("com.saucelabs.mydemoapp.android:id/expirationDateET");
	private By txtCodSeguranca = By.id("com.saucelabs.mydemoapp.android:id/securityCodeET");
	private By btnRevisar = By.id("com.saucelabs.mydemoapp.android:id/paymentBtn");
	
	/*Preencher Endereço*/
	public void preencherDadosPagamento() {
		
		sendKeys(txtName,"teste");
		sendKeys(txtNumeroCartao,"1234123412341234102");
		sendKeys(txtExpiracao,"1036");
		sendKeys(txtCodSeguranca,"123");
		
		
		click(btnRevisar);
		
	}
	
	/*Preenhcer Pagamento*/
	
	/*Review your ordem*/	

	
}
