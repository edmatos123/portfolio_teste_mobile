package validation;


import static org.junit.jupiter.api.Assertions.assertTrue;

import pages.BasePage;
import pages.PageCheckoutRevisao;

public class CheckoutValidation extends BasePage {
	
	PageCheckoutRevisao telaCheckoutResisao = new PageCheckoutRevisao();
	
	/*VALIDAR MENSAGEM DE SUCESSO*/
	public void validarCheckoutCompleto()
	{	
		assertTrue(telaCheckoutResisao.verificarMensagemCheckou(),"O Checkout não foi completado!");
	}
	

}
