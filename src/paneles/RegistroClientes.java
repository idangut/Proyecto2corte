package paneles;

import datos.clientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicArrowButton;


public class RegistroClientes extends JFrame implements ActionListener {

    clientes cliente;
    private JTextField JTnombre, JTapellido, JTempresa, JTsueldo, JTcedula, JTedad;
    private JLabel JLnombre, JLapellido, JLempresa, JLsueldo, JLcedula, JLedad;
    private JButton JBregistrar;
    private String nombre;
    private String apellido;
    private String empresa;
    private String sueldo;
    private int cedula;
    private int edad;
    private ArrayList<Object[]> cliente1 = new ArrayList<Object[]>();

    public RegistroClientes() {
        this.setTitle("Registro Clientes");
        this.setSize(400, 300); 
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setUndecorated(false);
        this.setLayout(null);
        //labels
        JLnombre = new JLabel("Nombre: ");
        JLnombre.setBounds(20, 40, 80, 20);
        add(JLnombre);

        JLapellido = new JLabel("Apellido: ");
        JLapellido.setBounds(20, 70, 80, 20);
        add(JLapellido);

        JLcedula = new JLabel("Cedula: ");
        JLcedula.setBounds(20, 100, 80, 20);
        add(JLcedula);

        JLedad = new JLabel("Edad: ");
        JLedad.setBounds(20, 130, 80, 20);
        add(JLedad);

        JLempresa = new JLabel("Empresa: ");
        JLempresa.setBounds(20, 160, 80, 20);
        add(JLempresa);

        JLsueldo = new JLabel("Sueldo: ");
        JLsueldo.setBounds(20, 190, 80, 20);
        add(JLsueldo);

        //jtextfield
        JTnombre = new JTextField();
        JTnombre.setBounds(120, 40, 150, 20);
        add(JTnombre);

        JTapellido = new JTextField();
        JTapellido.setBounds(120, 70, 150, 20);
        add(JTapellido);

        JTcedula = new JTextField();
        JTcedula.setBounds(120, 100, 150, 20);
        add(JTcedula);

        JTedad = new JTextField();
        JTedad.setBounds(120, 130, 150, 20);
        add(JTedad);

        JTempresa = new JTextField();
        JTempresa.setBounds(120, 160, 150, 20);
        add(JTempresa);

        JTsueldo = new JTextField();
        JTsueldo.setBounds(120, 190, 150, 20);
        add(JTsueldo);

        //jbutton
        JBregistrar = new JButton("Registrar");
        JBregistrar.setBounds(150, 230, 100, 25);
        JBregistrar.addActionListener(this);
        add(JBregistrar);

        this.setVisible(true);
    }//constructor

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == JBregistrar) {
            nombre=JTnombre.getText();
            apellido=JTapellido.getText();
            cedula=Integer.parseInt(JTcedula.getText());
            edad=Integer.parseInt(JTedad.getText());
            empresa=JTempresa.getText();
            sueldo=JTsueldo.getText();
            cliente= new clientes(nombre,apellido,empresa,sueldo,cedula,edad);
            cliente1.addAll((Collection<? extends Object[]>) new RegistroClientes());

            this.setVisible(true);
        }//if
    }//actionPerfomed

}//RegistroCliente
