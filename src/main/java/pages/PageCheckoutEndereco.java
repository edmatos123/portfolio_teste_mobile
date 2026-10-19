package pages;

import org.openqa.selenium.By;

public class PageCheckoutEndereco extends BasePage{
	
	private By txtName = By.id("com.saucelabs.mydemoapp.android:id/fullNameET");
	private By txtEndereco = By.id("com.saucelabs.mydemoapp.android:id/address1ET");
	private By txtCidade = By.id("com.saucelabs.mydemoapp.android:id/cityET");
	private By txtCep = By.id("com.saucelabs.mydemoapp.android:id/zipET");
	private By txtPais = By.id("com.saucelabs.mydemoapp.android:id/countryET");
	private By btnPagamento = By.id("com.saucelabs.mydemoapp.android:id/paymentBtn");
	
	/*Preencher Endereço*/
	public void preencherDadosEndereco(String name, String endereco, String cidade, String cep, String pais) {
		
		sendKeys(txtName,name);
		sendKeys(txtEndereco,endereco);
		sendKeys(txtCidade,cidade);
		sendKeys(txtCep,cep);
		sendKeys(txtPais,pais);
		
		click(btnPagamento);
		
	}
	
	/*Preenhcer Pagamento*/
	
	/*Review your ordem*/	

	
}
