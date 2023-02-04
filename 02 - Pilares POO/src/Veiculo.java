public abstract class Veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    // Classes precisam implementar o método ligar (polimorfismo).
    public abstract void ligar();
    
}
