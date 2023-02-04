package exemplo_interface.equipamentos.impressora;

public class Deskjet implements Impressora{

    @Override
    public void imprimir() {
        System.out.println("Deskjet imprimindo");        
    }
    
}
