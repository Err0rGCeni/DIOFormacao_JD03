package exemplo_interface.equipamentos.copiadora;

public class Xerox implements Copiadora{

    @Override
    public void copiar() {
        System.out.println("Copiando");        
    }
    
}
