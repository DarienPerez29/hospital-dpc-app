package hospitaldpc;

import hospitaldpc.interfaces.Login;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Hospital_DPC {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new Login().setVisible(true);
        }//end try
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el programa...\nVerifica tu instalación de Windows.\nERROR: " + e,
                    "Error de ejecución del programa", JOptionPane.ERROR_MESSAGE);
        }//end catch
    }//end main

}//end main class
