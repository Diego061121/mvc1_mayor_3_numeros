package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //-----------------
    //----ATRIBUTOS----
    //-----------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

    //-----------------
    //-----METODOS-----
    //-----------------

    //Metodo Constructor
    public VentanaPrincipal()
    {
        //Definicion del contenedor de la ventana
        this.setLayout(null);

        //Creacion y adicion de un panel tipo PanelEntradaDatos
        miPanelEntradaDatos  = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10, 10, 465, 200);
        this.add(miPanelEntradaDatos);

        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10, 210, 465, 60);
        this.add(miPanelOperaciones);

        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10, 270, 465, 180);
        this.add(miPanelResultados);

        //Caracteristicas de la ventana
        this.setTitle("Mayor de 3 enteros");
        this.setSize(500, 500);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
