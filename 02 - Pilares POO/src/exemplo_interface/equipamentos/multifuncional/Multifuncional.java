package exemplo_interface.equipamentos.multifuncional;

import exemplo_interface.equipamentos.copiadora.Copiadora;
import exemplo_interface.equipamentos.digitalizadora.Digitalizadora;
import exemplo_interface.equipamentos.impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora {
    
    @Override
    public void imprimir() {
        System.out.println("Multifuncional imprimindo");        
    }

    @Override
    public void digitalizar() {
        System.out.println("Multifuncional digitalizando");        
    }

    @Override
    public void copiar() {
        System.out.println("Multifuncional copiando");        
    }
    
}
