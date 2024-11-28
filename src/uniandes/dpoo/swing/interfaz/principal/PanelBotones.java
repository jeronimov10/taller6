package uniandes.dpoo.swing.interfaz.principal;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBotones extends JPanel implements ActionListener
{
    /**
     * El comando para el botón para crear un nuevo restaurante
     */
    private static final String NUEVO = "nuevo";

    /**
     * El comando para el botón para ver todos los restaurantes en el mapa
     */
    private static final String VER = "ver";

    private JButton butNuevo;
    private JButton butVerTodos;
    private VentanaPrincipal ventanaPrincipal;

    public PanelBotones( VentanaPrincipal ventanaPrincipal )
    {
        this.ventanaPrincipal = ventanaPrincipal;

        setLayout( new FlowLayout( ) );

        butNuevo = new JButton("Nuevo");
        butNuevo.setBackground(Color.WHITE);
        butNuevo.setFont(new Font("Viner Hand ITC", Font.BOLD ,24));
        butNuevo.addActionListener(this);
        butNuevo.setActionCommand(NUEVO);
        butNuevo.setForeground(Color.BLACK);
        butNuevo.setVisible(true);
        
        this.add(butNuevo);
        
        
        butVerTodos = new JButton("Ver todos");
        butVerTodos.setBackground(Color.WHITE);
        butVerTodos.setFont(new Font("Viner Hand ITC", Font.BOLD ,24));
        butVerTodos.addActionListener(this);
        butVerTodos.setActionCommand(VER);
        butVerTodos.setForeground(Color.BLACK);
        butVerTodos.setVisible(true);
        
        this.add(butVerTodos);
    }

    @Override
    public void actionPerformed( ActionEvent e )
    {
        String comando = e.getActionCommand( );
        if( comando.equals( NUEVO ) )
        {
            ventanaPrincipal.mostrarVetanaNuevoRestaurante( );
        }
        else if( comando.equals( VER ) )
        {
            ventanaPrincipal.mostrarVentanaMapa( );
        }
    }
}
