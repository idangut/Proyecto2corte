package paneles;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import datos.*;

import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;
import java.awt.Font;

public class Centro extends JPanel{

	private JTable tabla_vehiculos;
	
	Izquierdo i;
	private String[] columnas = {" Marca ", " Nombre", " Cantidad ", " ValorU ", " Peso "};
	private ArrayList<Object[]> personas = new ArrayList<Object[]>();
	private DefaultTableModel table_model;
	private Object[][] datos;
	Electrodomestico persona;
	private int j=0;
	
		
	public Centro(ArrayList<Object[]> a) {
		this.personas=a;
		
	}
	
	


	public ArrayList<Object[]> getPersonas() {
		return personas;
	}




	public void setPersonas(ArrayList<Object[]> personas) {
		this.personas = personas;
	}




	public Centro() {
			
			
			this.configurarComponentes();
			
			
			this.setVisible(true);
		}


		private void configurarComponentes() {
			
			datos = personas.toArray(new Object[personas.size()][]);
			table_model = new DefaultTableModel(datos, columnas);
			tabla_vehiculos = new JTable(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
				}
			));
			tabla_vehiculos.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
			tabla_vehiculos.setBorder(new TitledBorder(null, "VISUALIZACION DE DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.textHighlight));
			tabla_vehiculos.setBackground(Color.DARK_GRAY);
			
			
			i = new Izquierdo(table_model, personas);
		
			
			JScrollPane scrollPane = new JScrollPane(tabla_vehiculos);
			scrollPane.setViewportBorder(new TitledBorder(null, "VISUALIZACION DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.textHighlight));
			this.add(scrollPane, BorderLayout.CENTER);
		}
		
		
		
		
	
}
