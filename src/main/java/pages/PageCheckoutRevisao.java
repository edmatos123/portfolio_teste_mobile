package pages;

import org.openqa.selenium.By;

public class PageCheckoutRevisao extends BasePage{
	
	private By btnPedido = By.id("com.saucelabs.mydemoapp.android:id/paymentBtn");
	private By lblCompleto = By.id("com.saucelabs.mydemoapp.android:id/completeTV");
	
	/*Preencher Endereço*/
	public void confirmarPedido() {				
		click(btnPedido);		
	}
	
	public boolean verificarMensagemCheckou() {
		return isElementVisible(lblCompleto);
	}
	
	/*Preenhcer Pagamento*/
	
	/*Review your ordem*/	

	
}
