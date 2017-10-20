package paneles;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
//import javax.swing.JTextField;
import java.awt.Font;

public class Superior extends JPanel {

	public Superior() {
		  setLayout( new BorderLayout( ) );
	        JLabel imagen = new JLabel( );
	        imagen.setBackground(Color.DARK_GRAY);
	        imagen.setHorizontalAlignment(SwingConstants.LEFT);
	        imagen.setForeground(Color.DARK_GRAY);
	        JLabel imagen2 = new JLabel( );
	        imagen2.setBackground(Color.DARK_GRAY);
	        imagen2.setHorizontalAlignment(SwingConstants.CENTER);
	        imagen2.setForeground(Color.DARK_GRAY);
	        
	        ImageIcon icono2 = new ImageIcon( "img/superior.png" );
	        
	        imagen2.setIcon(icono2);
	        
	        add( imagen2, BorderLayout.WEST );
	               
	        setBackground( Color.DARK_GRAY );
	        
	        JLabel lblElectrodomesticosUdec_1 = new JLabel("ELECTRODOMESTICOS UDEC");
	        lblElectrodomesticosUdec_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblElectrodomesticosUdec_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 37));
	        lblElectrodomesticosUdec_1.setForeground(Color.WHITE);
	        add(lblElectrodomesticosUdec_1, BorderLayout.CENTER);
	}
	
}

