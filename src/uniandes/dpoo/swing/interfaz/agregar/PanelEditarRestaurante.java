package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    
    {
    	
    	this.setLayout(new GridLayout(8,1));
		
		
    	JLabel lblNombre = new JLabel("Nombre");
        txtNombre = new JTextField();
    	
   
    	

        JLabel lblCalificacion = new JLabel("Calificación:");
        cbbCalificacion = new JComboBox<>();
        cbbCalificacion.addItem("1");
        cbbCalificacion.addItem("2");
        cbbCalificacion.addItem("3");
        cbbCalificacion.addItem("4");
        cbbCalificacion.addItem("5");
        
        JLabel lblVisitado = new JLabel("¿Visitado?");
        cbbVisitado = new JComboBox<>();
        cbbVisitado.addItem("Sí");
        cbbVisitado.addItem("No");


        this.add(lblNombre);
        this.add(txtNombre);
        this.add(lblCalificacion);
        this.add(cbbCalificacion);
        this.add(lblVisitado);
        this.add(cbbVisitado);
    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
    	
    	
    	String visit = ( String )cbbVisitado.getSelectedItem( );
    	
    	if (visit.equals("Sí")) {
    		return true;
    	} else {
    		return false;
    		
    	}
    	
        
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
    	String nombre = ( String )txtNombre.getText();
        return nombre;
    }
}
