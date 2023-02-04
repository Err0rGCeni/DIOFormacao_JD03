package MSN;

public class MSNMessenger extends ServicoMensagem {
    
    @Override
    public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN");
		salvarHistoricoMensagem();
	}

    @Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN");
	}	

	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
    
}
