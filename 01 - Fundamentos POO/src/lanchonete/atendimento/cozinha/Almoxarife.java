package lanchonete.atendimento.cozinha;

public class Almoxarife {
	
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}

	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	// Apenas cozinha pode visualizar	
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida();
	}
	// Apenas cozinha pode visualizar
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}
