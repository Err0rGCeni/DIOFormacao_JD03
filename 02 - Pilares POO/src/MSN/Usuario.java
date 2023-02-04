package MSN;

public class Usuario {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();
        Facebook fcb = new Facebook();
        fcb.enviarMensagem();
        fcb.receberMensagem();
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();

        ServicoMensagem sm = null;
        String appEscolhido = "???";
        
        if (appEscolhido.equals("msn")) {
            sm = new MSNMessenger();
        }
        else if (appEscolhido.equals("fbm")) {
            sm = new Facebook();
        }
        else if (appEscolhido.equals("tlg")) {
            sm = new Telegram();
        }

        sm.enviarMensagem();
        sm.receberMensagem();
    }
    
}
