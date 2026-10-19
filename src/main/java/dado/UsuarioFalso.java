package dado;

import com.github.javafaker.Faker;

import modelo.Checkout;

public class UsuarioFalso {
	
	
	private static Faker faker = new Faker();

    public Checkout criarUsuarioCompleto() {

        return new Checkout()

                .name(faker.name().fullName())
                .endereco(faker.address().streetAddress())  
                .cidade(faker.address().city())
                .cep(faker.address().zipCode())
                .pais("Canada");
    }
	

}
