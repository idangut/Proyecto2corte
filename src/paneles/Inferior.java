package paneles;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;

public class Inferior extends JPanel{

	public Inferior() {
		
		setLayout( new BorderLayout( ) );
        JLabel imagen = new JLabel( );

        ImageIcon icono = new ImageIcon( "img/inferior.png" );
       
        
        imagen.setIcon( icono );

        imagen.setHorizontalAlignment( JLabel.CENTER );
    
        add( imagen, BorderLayout.WEST );

        setBackground( Color.DARK_GRAY );
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "CONSULTAS", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.textHighlight));
        panel.setBackground(Color.DARK_GRAY);
        FlowLayout flowLayout = (FlowLayout) panel.getLayout();
        flowLayout.setAlignment(FlowLayout.LEADING);
        add(panel, BorderLayout.EAST);
        
        JButton btnCliente = new JButton("Mejor Cliente");
        btnCliente.setIcon(new ImageIcon("C:\\Users\\gtior\\eclipse-workspace\\proyecto\\img\\best.png"));
        btnCliente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        panel.add(btnCliente);
        
        JButton btnGanancias = new JButton("Ganancias");
        btnGanancias.setIcon(new ImageIcon("C:\\Users\\gtior\\eclipse-workspace\\proyecto\\img\\ganancias.png"));
        panel.add(btnGanancias);
        
        JLabel lblConsultas = new JLabel("PROYECTO");
        lblConsultas.setForeground(Color.WHITE);
        lblConsultas.setHorizontalAlignment(SwingConstants.CENTER);
        lblConsultas.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 39));
        add(lblConsultas, BorderLayout.CENTER);
	}
}
