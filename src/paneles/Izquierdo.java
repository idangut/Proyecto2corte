package paneles;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import datos.*;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Izquierdo extends JPanel implements ActionListener {


    public static final String AGREGAR = "AGREGAR";
    public static final String LISTAR = "LISTAR";
    public static final String REGISTRAR = "Registrar";
     
	

    private JButton btnRegistrar;
    private JButton btnListar;
    private String[] columnas = {" Marca ", " Nombre", " Cantidad ", " ValorU ", " Peso "};
    private JTextField nombre,marca,cantidad,valorU,peso;
    private ArrayList<Electrodomestico> lista2 = new ArrayList<Electrodomestico>();
    private Map<Integer, String> mapa = new TreeMap<Integer, String>();
    private ArrayList<Object[]> lista1 = new ArrayList<Object[]>();
    private DefaultTableModel referencia_tabla_model;
	private ArrayList<Object[]> referencia_almacen;
	private GridBagConstraints gbc_btnRegistrar;
	private JLabel lblRegistroProducto;
	private JButton btnEliminarCompra;
	private JButton btnAlertaInventario;
	private JButton btnRegistrarcliente;
	private JButton btnListarcliente;
	private JButton btnMejoresClientes;
	private JButton btnIniciarCompra;
	private JLabel lblClientes;
	private JLabel lblComprar;
	private GridBagConstraints gbc_Marca;
	private GridBagConstraints gbc_Cantidad;
	private GridBagConstraints gbc_ValorU;
	private GridBagConstraints gbc_Peso;
	private GridBagConstraints gbc_marca;
	private GridBagConstraints gbc_cantidad;
	private GridBagConstraints gbc_valorU;
    
	
	
	
    
	public Map<Integer, String> getMapa() {
		return mapa;
	}

	public void setMapa(Map<Integer, String> mapa) {
		this.mapa = mapa;
	}

	
	public Izquierdo(DefaultTableModel referencia_tabla_model, ArrayList<Object[]> referencia_almacen) {
		super();
		setBackground(Color.DARK_GRAY);
		this.referencia_tabla_model = referencia_tabla_model;
		this.referencia_almacen = referencia_almacen;
		
	    this.iniciar();  
	}

	public void iniciar() {

		 		
        setLayout( new GridBagLayout( ) );

        Border borde = BorderFactory.createTitledBorder( "OPERACIONES CAJA" );
        setBorder( borde );
        
       
        GridBagConstraints constraint = new GridBagConstraints( );

        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.BOTH;

        Insets insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        insets = new Insets( 5, 10, 5, 10 );
        
        lblRegistroProducto = new JLabel("REGISTRO PRODUCTO");
        lblRegistroProducto.setForeground(Color.WHITE);
        lblRegistroProducto.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
        GridBagConstraints gbc_lblRegistroProducto = new GridBagConstraints();
        gbc_lblRegistroProducto.insets = new Insets(0, 0, 5, 0);
        gbc_lblRegistroProducto.gridx = 1;
        gbc_lblRegistroProducto.gridy = 0;
        add(lblRegistroProducto, gbc_lblRegistroProducto);
         
         
         JLabel nom = new JLabel("Nombre :");
         nom.setForeground(Color.WHITE);
         nom.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
         constraint = new GridBagConstraints( );
         constraint.gridx = 0;
         constraint.gridy = 1;
         constraint.fill = GridBagConstraints.BOTH; 
         constraint.insets = insets;
         add(nom,constraint);
         
         nombre = new JTextField(5);
         nombre.setBackground(SystemColor.activeCaption);
         nombre.addActionListener(this);
         constraint = new GridBagConstraints( );
         constraint.gridx = 1;
         constraint.gridy = 1;
         constraint.fill = GridBagConstraints.BOTH; 
         constraint.insets = insets;
         add(nombre,constraint);
        
         
         JLabel Marca = new JLabel("Marca:");
         Marca.setForeground(Color.WHITE);
         Marca.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
         gbc_Marca = new GridBagConstraints( );
         gbc_Marca.gridx = 0;
         gbc_Marca.gridy = 2;
         gbc_Marca.fill = GridBagConstraints.BOTH; 
         gbc_Marca.insets = insets;
         add(Marca,gbc_Marca);
        
        marca = new JTextField(5);
        marca.setBackground(SystemColor.activeCaption);
        marca.addActionListener(this);
        gbc_marca = new GridBagConstraints( );
        gbc_marca.gridx = 1;
        gbc_marca.gridy = 2;
        gbc_marca.fill = GridBagConstraints.BOTH; 
        gbc_marca.insets = insets;
        add(marca,gbc_marca);
        
        
        JLabel Cantidad = new JLabel("Cantidad :");			
        Cantidad.setForeground(Color.WHITE);
        Cantidad.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
        gbc_Cantidad = new GridBagConstraints( );
        gbc_Cantidad.gridx = 0;
        gbc_Cantidad.gridy = 3;
        gbc_Cantidad.fill = GridBagConstraints.BOTH; 
        gbc_Cantidad.insets = insets;
        add(Cantidad,gbc_Cantidad);
         
         
         cantidad = new JTextField(5);
         cantidad.setBackground(SystemColor.activeCaption);
         cantidad.addActionListener(this);
         gbc_cantidad = new GridBagConstraints( );
         gbc_cantidad.gridx = 1;
         gbc_cantidad.gridy = 3;
         gbc_cantidad.fill = GridBagConstraints.BOTH;
         gbc_cantidad.insets = insets;
         add(cantidad,gbc_cantidad);
        
         
         JLabel ValorU = new JLabel("ValorU :");
         ValorU.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
         ValorU.setForeground(Color.WHITE);
         gbc_ValorU = new GridBagConstraints( );
         gbc_ValorU.gridx = 0;
         gbc_ValorU.gridy = 4;
         gbc_ValorU.fill = GridBagConstraints.BOTH; 
         gbc_ValorU.insets = insets;
         add(ValorU,gbc_ValorU);
        
        valorU = new JTextField(5);
        valorU.setBackground(SystemColor.activeCaption);
        valorU.addActionListener(this);
        gbc_valorU = new GridBagConstraints( );
        gbc_valorU.gridx = 1;
        gbc_valorU.gridy = 4;
        gbc_valorU.fill = GridBagConstraints.BOTH; 
        gbc_valorU.insets = insets;
        add(valorU,gbc_valorU);
        
        
        JLabel Peso = new JLabel("Peso :");
        Peso.setForeground(Color.WHITE);
        Peso.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
        gbc_Peso = new GridBagConstraints( );
        gbc_Peso.gridx = 0;
        gbc_Peso.gridy = 5;
        gbc_Peso.fill = GridBagConstraints.BOTH; 
        gbc_Peso.insets = insets;
        add(Peso,gbc_Peso);
        insets = new Insets( 5, 10, 5, 10 );
        insets = new Insets( 5, 10, 5, 10 );
        insets = new Insets( 5, 10, 5, 10 );
        insets = new Insets( 5, 10, 5, 10 );
        insets = new Insets( 5, 10, 5, 10 );
        insets = new Insets( 5, 10, 5, 10 );
        insets = new Insets( 5, 10, 5, 10 );
        insets = new Insets( 5, 10, 5, 10 );
        insets = new Insets( 5, 10, 5, 10 );
        insets = new Insets( 5, 10, 5, 10 );
        
        
        peso = new JTextField(5);
        peso.setBackground(SystemColor.activeCaption);
        peso.addActionListener(this);
        constraint = new GridBagConstraints( );
        constraint.gridx = 1;
        constraint.gridy = 5;
        constraint.fill = GridBagConstraints.BOTH;
        constraint.insets = insets;
        add(peso,constraint);
        
        
        btnRegistrar = new JButton( "Registrar y Listar" );
        btnRegistrar.setIcon(new ImageIcon("C:\\Users\\gtior\\eclipse-workspace\\proyecto\\img\\add.png"));
        btnRegistrar.addActionListener( this );
        btnRegistrar.setActionCommand( AGREGAR );	       
        gbc_btnRegistrar = new GridBagConstraints( );
        gbc_btnRegistrar.gridx = 1;
        gbc_btnRegistrar.gridy = 6;
        gbc_btnRegistrar.fill = GridBagConstraints.BOTH; 
        gbc_btnRegistrar.insets = insets;	        
        add( btnRegistrar, gbc_btnRegistrar );
        
        btnAlertaInventario = new JButton("Alerta Inventario");
        btnAlertaInventario.setIcon(new ImageIcon("C:\\Users\\gtior\\eclipse-workspace\\proyecto\\img\\alert.png"));
        GridBagConstraints gbc_btnAlertaInventario = new GridBagConstraints();
        gbc_btnAlertaInventario.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnAlertaInventario.insets = new Insets(0, 0, 5, 0);
        gbc_btnAlertaInventario.gridx = 1;
        gbc_btnAlertaInventario.gridy = 7;
        add(btnAlertaInventario, gbc_btnAlertaInventario);
        
        lblClientes = new JLabel("CLIENTES");
        lblClientes.setForeground(Color.WHITE);
        lblClientes.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
        GridBagConstraints gbc_lblClientes = new GridBagConstraints();
        gbc_lblClientes.insets = new Insets(0, 0, 5, 5);
        gbc_lblClientes.gridx = 0;
        gbc_lblClientes.gridy = 9;
        add(lblClientes, gbc_lblClientes);
        
        btnRegistrarcliente = new JButton("RegistrarCliente");
        btnRegistrarcliente.setIcon(new ImageIcon("C:\\Users\\gtior\\eclipse-workspace\\proyecto\\img\\register.png"));
        GridBagConstraints gbc_btnRegistrarcliente = new GridBagConstraints();
        gbc_btnRegistrarcliente.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnRegistrarcliente.insets = new Insets(0, 0, 5, 0);
        gbc_btnRegistrarcliente.gridx = 1;
        gbc_btnRegistrarcliente.gridy = 9;
        add(btnRegistrarcliente, gbc_btnRegistrarcliente);
        
        btnListarcliente = new JButton("ListarCliente");
        btnListarcliente.setIcon(new ImageIcon("C:\\Users\\gtior\\eclipse-workspace\\proyecto\\img\\list.png"));
        GridBagConstraints gbc_btnListarcliente = new GridBagConstraints();
        gbc_btnListarcliente.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnListarcliente.insets = new Insets(0, 0, 5, 0);
        gbc_btnListarcliente.gridx = 1;
        gbc_btnListarcliente.gridy = 10;
        add(btnListarcliente, gbc_btnListarcliente);
        
        btnMejoresClientes = new JButton("Mejores Clientes");
        btnMejoresClientes.setIcon(new ImageIcon("C:\\Users\\gtior\\eclipse-workspace\\proyecto\\img\\award.png"));
        GridBagConstraints gbc_btnMejoresClientes = new GridBagConstraints();
        gbc_btnMejoresClientes.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnMejoresClientes.insets = new Insets(0, 0, 5, 0);
        gbc_btnMejoresClientes.gridx = 1;
        gbc_btnMejoresClientes.gridy = 11;
        add(btnMejoresClientes, gbc_btnMejoresClientes);
        
        lblComprar = new JLabel("COMPRAR");
        lblComprar.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
        lblComprar.setForeground(Color.WHITE);
        GridBagConstraints gbc_lblComprar = new GridBagConstraints();
        gbc_lblComprar.insets = new Insets(0, 0, 5, 5);
        gbc_lblComprar.gridx = 0;
        gbc_lblComprar.gridy = 13;
        add(lblComprar, gbc_lblComprar);
        
        btnIniciarCompra = new JButton("Iniciar Compra");
        btnIniciarCompra.setIcon(new ImageIcon("C:\\Users\\gtior\\eclipse-workspace\\proyecto\\img\\add2.png"));
        GridBagConstraints gbc_btnIniciarCompra = new GridBagConstraints();
        gbc_btnIniciarCompra.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnIniciarCompra.insets = new Insets(0, 0, 5, 0);
        gbc_btnIniciarCompra.gridx = 1;
        gbc_btnIniciarCompra.gridy = 13;
        add(btnIniciarCompra, gbc_btnIniciarCompra);
        
        btnEliminarCompra = new JButton("Eliminar Compra");
        btnEliminarCompra.setIcon(new ImageIcon("C:\\Users\\gtior\\eclipse-workspace\\proyecto\\img\\delete.png"));
        GridBagConstraints gbc_btnEliminarCompra = new GridBagConstraints();
        gbc_btnEliminarCompra.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnEliminarCompra.gridx = 1;
        gbc_btnEliminarCompra.gridy = 14;
        add(btnEliminarCompra, gbc_btnEliminarCompra);
        
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {

		String accion = e.getActionCommand( );
        if( accion.equals( AGREGAR ) ) {
        	
        	
        	String n = nombre.getText();
        
                 	
        	String a = marca.getText();
        
        	String c = cantidad.getText();
        	
  
        	int ce = Integer.parseInt(c);
            String ed = valorU.getText();
          
            
            int eda = Integer.parseInt(ed);
            String p = peso.getText();
          
            
            String pe = peso.getText();
            
          
            
            //mapa.put(ce,datos2);
            Electrodomestico perso = new Electrodomestico(n,ce,a,pe,eda);
            lista1.add(perso.getDetalles());
            //int cedula, String nombre, String apellido,int edad,int peso
            referencia_almacen.add(Electrodomestico.build(ce,n,a,eda,pe).getDetalles());
    		Object[][] datos = referencia_almacen.toArray(new Object[referencia_almacen.size()][]);
    		referencia_tabla_model.setDataVector(datos, columnas);
    		
            this.nombre.setText("");
            this.marca.setText("");
            this.cantidad.setText("");
            this.valorU.setText("");
            this.peso.setText("");
            
            
        }
        else {
        	
        }//else
        /*if( accion.equals( LISTAR ) ) {
           	Centro c = new Centro(lista1);
           	Iterator<Integer> it = mapa.keySet().iterator();
    		while(it.hasNext()){
    		  Integer key = it.next();
    		  System.out.println("Clave: " + key + " -> Valor: " + mapa.get(key));
    		}//while*/
           	
	//if LISTAR
	
       
        if (accion.equals(REGISTRAR)) {
            RegistroClientes r = new RegistroClientes();

        } else {

        }
        if (accion.equals(btnListarcliente)) {
            ListadoClientes r = new ListadoClientes();
            r.setVisible(true);
        } else {

        }
}//actionPerformed
	

}//izquierdo
