package exemplo_interface.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora{

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando");        
    }
    
}
