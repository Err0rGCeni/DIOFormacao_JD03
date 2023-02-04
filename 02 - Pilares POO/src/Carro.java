public class Carro extends Veiculo {
    public void ligar() {
        this.confereCambio();
        this.confereCombustível();
        System.out.println("Carro ligado!");
    }

    private void confereCombustível() {
        System.out.println("Conferindo combustível.");
    }

    private void confereCambio() {
        System.out.println("Conferindo cambio.");
    }
    
}
