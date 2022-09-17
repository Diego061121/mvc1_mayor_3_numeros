package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //-----------------
    //----ATRIBUTOS----
    //-----------------
    private JLabel lbTitulo;
    private JLabel LbX;
    private JLabel LbY;
    private JLabel LbZ;
    private JTextField tx;
    private JTextField ty;
    private JTextField tz;


    //-----------------
    //-----METODOS-----
    //-----------------

    //Metodo constructor
    public PanelEntradaDatos()
    {
        //Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar Etiquetas para la entrada de datos
        tx = new JTextField();
        tx.setFont(new Font("Arial", Font.BOLD, 15));
        tx.setForeground(Color.BLACK);
        tx.setBounds(100, 50, 120, 20);
        this.add(tx);

        ty = new JTextField();
        ty.setFont(new Font("Arial", Font.BOLD, 15));
        ty.setForeground(Color.BLACK);
        ty.setBounds(100, 100, 120, 20);
        this.add(ty);
        
        tz = new JTextField();
        tz.setFont(new Font("Arial", Font.BOLD, 15));
        tz.setForeground(Color.BLACK);
        tz.setBounds(100, 150, 120, 20);
        this.add(tz);

        LbX = new JLabel("X= ", JLabel.RIGHT);
        LbX.setFont(new Font("Arial", Font.BOLD, 20));
        LbX.setForeground(Color.BLACK);
        LbX.setBounds(50, 50, 40, 20);
        this.add(LbX);

        LbY = new JLabel("Y= ", JLabel.RIGHT);
        LbY.setFont(new Font("Arial", Font.BOLD, 20));
        LbY.setForeground(Color.BLACK);
        LbY.setBounds(50, 100, 40, 20);
        this.add(LbY);

        LbZ = new JLabel("Z= ", JLabel.RIGHT);
        LbZ.setFont(new Font("Arial", Font.BOLD, 20));
        LbZ.setForeground(Color.BLACK);
        LbZ.setBounds(50, 150, 40, 20);
        this.add(LbZ);


        //Crear y agregar etiqueta para titulo
        lbTitulo = new JLabel("MAYOR 3 ENTEROS", JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial",Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLUE);
        lbTitulo.setBounds(10, 10, 465, 20);
        this.add(lbTitulo);

        //Borde y titulo
        TitledBorder borde = BorderFactory.createTitledBorder("DATOS ENTRADA");
        borde.setTitleColor(Color.black);
        this.setBorder(borde);


    }

    //Metodos de acceso a la informacion
    public String gettx()
    {
        return tx.getText();
    }

    public String getty()
    {
        return ty.getText();
    }

    public String gettz()
    {
        return tz.getText();
    }

    //Metodo para borrar las cajas de texto
    public void borrar()
    {
        tx.setText("");
        ty.setText("");
        tz.setText("");
    }
}
