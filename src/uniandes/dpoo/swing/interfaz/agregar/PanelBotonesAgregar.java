package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBotonesAgregar extends JPanel implements ActionListener
{
    /**
     * El comando utilizado para el botón que sirve para crear un nuevo restaurante
     */
    private static final String CREAR = "nuevo";

    /**
     * El comando utilizado para el botón que sirve para cerrar la ventana sin crear un restaurante
     */
    private static final String CERRAR = "ver";

    private JButton butNuevo;
    private JButton butCerrar;

    /**
     * La ventana principal de la aplicación
     */
    private VentanaAgregarRestaurante ventanaPrincipal;

    public PanelBotonesAgregar( VentanaAgregarRestaurante ventanaPrincipal )
    {
        this.ventanaPrincipal = ventanaPrincipal;

        setLayout( new FlowLayout( ) );
        
        
        
        butNuevo = new JButton("Crear Restaurante");
        butNuevo.setBackground(Color.WHITE);
        butNuevo.setFont(new Font("Times New Roman", Font.BOLD, 12));
        butNuevo.addActionListener(this);
        butNuevo.setActionCommand(CREAR);
        butNuevo.setForeground(Color.BLACK);
        
        
        butCerrar = new JButton("Cerrar");
        butCerrar.setBackground(Color.WHITE);
        butCerrar.setFont(new Font("Times New Roman", Font.BOLD, 12));
        butCerrar.addActionListener(this);
        butCerrar.setActionCommand(CERRAR);
        butCerrar.setForeground(Color.BLACK);

        
        add(butNuevo);
        add(butCerrar);
        
     
    }

    @Override
    public void actionPerformed( ActionEvent e )
    {
        String comando = e.getActionCommand( );
        if( comando.equals( CREAR ) )
        {
            ventanaPrincipal.agregarRestaurante( );
        }
        else if( comando.equals( CERRAR ) )
        {
            ventanaPrincipal.cerrarVentana( );
        }
    }
}
