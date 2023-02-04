package MSN;

public class Facebook extends ServicoMensagem {

    @Override
    public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook");
		salvarHistoricoMensagem();
	}

    @Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook");
	}

	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}

}
