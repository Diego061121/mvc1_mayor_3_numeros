package controlador;

import modelo.Mayor3Enteros;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Controlador implements ActionListener
{
    //----------------
    //Atributos
    //----------------
    private VentanaPrincipal venPrin;
    private Mayor3Enteros model;

    //----------------
    //Metodos
    //----------------

    //Medodo constructor
    public Controlador(VentanaPrincipal pVenPrin, Mayor3Enteros pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.btHallarMayor.addActionListener(this);
        this.venPrin.miPanelOperaciones.btBorrar.addActionListener(this);
        this.venPrin.miPanelOperaciones.btSalir.addActionListener(this);
    }

    //Metodo de atención de eventos
    public void actionPerformed(ActionEvent ae)
    {   
        //Identificar el comando generado (hallarMayor, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("hallarMayor"))
        {
            try
            {
                this.model.setX(Integer.parseInt(this.venPrin.miPanelEntradaDatos.gettx()));
                this.model.setX(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getty()));
                this.model.setX(Integer.parseInt(this.venPrin.miPanelEntradaDatos.gettz()));
                this.model.hallarMayor();
                this.venPrin.miPanelResultados.mostrarResultado(this.model.getMayor());
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Datos incorrectos. \nLOs datos deben ser enteros", "Suma 3 enteros", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(comando.equals("borrar"))
        {
            JOptionPane.showMessageDialog(null, "Los datos seran borrados", "Suma 3 enteros", JOptionPane.WARNING_MESSAGE);
            this.venPrin.miPanelEntradaDatos.borrar();
            this.venPrin.miPanelResultados.borrar();
        }
        if(comando.equals("salir"))
        {
            JOptionPane.showMessageDialog(null, "La ventana sera borrada");
            System.exit(0);
        }
    }
}
