package paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.SystemColor;



public class Ventana extends JFrame {

	Superior Arriba;
	Inferior Abajo;
	Centro PCentro;
	Izquierdo datos;
	
	private Izquierdo formulario;
	
	private JTable tablaP;
	private String[] columnas = {" Marca ", " Nombre", " Cantidad ", " ValorU ", " Peso "};
	private ArrayList<Object[]> personas = new ArrayList<Object[]>();
	private DefaultTableModel table_model;
	private Object[][] datos2; 
	 private Map<Integer, String> mapa3 = new TreeMap<Integer, String>();
	
	
	
	
	public Ventana(){
		 super("PROYECTO 2 CORTE");
		 iniciar();
		 componente();
		 setVisible(true);
		 pack();
		
         setLocationRelativeTo( null );
	}
	
	public Ventana iniciar(){
				
				Dimension dims = new Dimension(800, 750);
				this.setSize(dims);
				this.setPreferredSize(dims);
				this.getContentPane( ).setLayout( new BorderLayout( ) );
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				return this;
	}
	
	
	public void componente() {
		
		
		
		Arriba = new Superior( );
        getContentPane().add( Arriba, BorderLayout.NORTH );

        Abajo = new Inferior();
        getContentPane().add( Abajo, BorderLayout.SOUTH );

        //PCentro = new Centro();
        //add( PCentro, BorderLayout.CENTER );

        //datos = new Izquierdo();
        //add( datos, BorderLayout.WEST );
        
        
        
        
		//busqueda = new Derecho();
		//add(busqueda ,BorderLayout.EAST);
		
		
		datos2 = personas.toArray(new Object[personas.size()][]);
		table_model = new DefaultTableModel(datos2, columnas);
		tablaP = new JTable(table_model);
		
		
		formulario = new Izquierdo(table_model, personas);
		formulario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "OPERACIONES CAJA", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.textHighlight));
		
		//this.add(mapa, BorderLayout.EAST);
		getContentPane().add(formulario, BorderLayout.WEST);
		JScrollPane scrollPane = new JScrollPane(tablaP);
		scrollPane.setToolTipText("");
		getContentPane().add(scrollPane, BorderLayout.CENTER);
	}
	
}
