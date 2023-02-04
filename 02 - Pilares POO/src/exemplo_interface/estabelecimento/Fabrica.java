package exemplo_interface.estabelecimento;

import exemplo_interface.equipamentos.impressora.*;
import exemplo_interface.equipamentos.copiadora.*;
import exemplo_interface.equipamentos.digitalizadora.*;
import exemplo_interface.equipamentos.multifuncional.Multifuncional;;

public class Fabrica {
    public static void main(String[] args) {
        Multifuncional em = new Multifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

        // Teste com a deskjet        
        Deskjet deskjet = new Deskjet();
        Impressora impressora2 = deskjet;
        // Digitalizadora digitalizadora2 = deskjet;
        // Copiadora copiadora2 = deskjet;
    }
    
}
