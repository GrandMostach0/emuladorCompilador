package emuladorcompilador.eventosBotones;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author GrandMostach0
 * 
 **/

public class buscarArchivos {
    
    public static void abrirExplorador(JFrame InterfazPadre){
        JFileChooser explorador = new JFileChooser();
        explorador.setDialogTitle("Selecciona un archivo");
        explorador.setPreferredSize(new java.awt.Dimension(1200, 600));
        explorador.showOpenDialog(InterfazPadre);
    }
}
