package MSN;

public abstract class ServicoMensagem {
    // Encapsulamento: Esconder atributos e métodos.
    // Herança: Classe pai para classes filhas herdarem.
    // Abstração: Classes filhas precisam implementar propriedades/métodos (que não possuem corpo).
    // Polimorfismo: Cada classe filha implementa o mesmo método, mas com conteúdo diferente.
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
	//public abstract void salvarHistoricoMensagem();
	
	//somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
    /*
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}	

	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}

	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
    */

}
