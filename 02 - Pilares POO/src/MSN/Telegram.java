package MSN;

public class Telegram extends ServicoMensagem {
    
    @Override
    public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}

    @Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}	

	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}    
    
}
