package paneles;

import datos.clientes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;


public class ListadoClientes extends JFrame {

	
	
	
	private JTable tabla_clientes;
    private String[] columnas = {" Nombre ", " Apellido", " Cedula ", " Edad ", " Empresa ", "Sueldo"};
    private ArrayList<Object[]> clientes = new ArrayList<Object[]>();
    private Object[][] datos;
    private DefaultTableModel table_model;
    clientes clien;

    public ListadoClientes(ArrayList<Object[]> a) {
        this.setTitle("Listado clientes");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setUndecorated(false);
        getContentPane().setLayout(null);

        this.clientes = a;

        this.setVisible(true);
    }//constructor

    public ListadoClientes() {
        this.configurarComponentes();
        this.setVisible(true);
    }
    
    
 public ArrayList<Object[]> getPersonas() {
        return clientes;
    }

    public void setPersonas(ArrayList<Object[]> personas) {
        this.clientes = personas;
    }
    private void configurarComponentes() {

        datos = clientes.toArray(new Object[clientes.size()][]);
        table_model = new DefaultTableModel(datos, columnas);
        tabla_clientes = new JTable(new DefaultTableModel(
                new Object[][]{},
                new String[]{}
        ));
        tabla_clientes.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
        tabla_clientes.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "VISUALIZACION DE DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 120, 215)));
        tabla_clientes.setBackground(Color.DARK_GRAY);

        //i = new Izquierdo(table_model, clientes);

        JScrollPane scrollPane = new JScrollPane(tabla_clientes);
        scrollPane.setViewportBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "VISUALIZACION DATOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 120, 215)));
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

}//ListadoClientes
