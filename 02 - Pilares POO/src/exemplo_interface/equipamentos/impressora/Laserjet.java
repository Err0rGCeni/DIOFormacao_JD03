package exemplo_interface.equipamentos.impressora;

public class Laserjet implements Impressora {

    @Override
    public void imprimir() {
        System.out.println("Laserjet imprimindo");        
    }
    
}
