package es.studium.PSP_1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;

public class Vista extends JFrame 
{
	private static final long serialVersionUID = 1L;

	JPanel contentPane= new JPanel();				
	JTextField txtCmd = new JTextField();
	JButton btnEjecutar= new JButton("Ejecutar");
	JButton btnNotepad = new JButton("Notepad");
	JButton btnPaint = new JButton("Paint");
	JButton btnReloj = new JButton("Reloj");
	JButton btnTerminar = new JButton("Terminar");
	JTextArea txtaCMD = new JTextArea();
	JLabel lblProcesosActivos = new JLabel("Procesos Activos");
	Choice ListaProcesos= new Choice();
	
	public Vista() 
	{	//Frame
		setTitle("Pr\u00E1ctica 1 PSP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 477);
		
		//Panel
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//TextoCMD
		txtCmd.setText("Escribe el comando");
		txtCmd.setBounds(25, 10, 128, 19);
		txtCmd.setColumns(10);
		contentPane.add(txtCmd);
		
		//BotonEjecutar
		btnEjecutar.setBounds(163, 9, 85, 21);
		contentPane.add(btnEjecutar);
		
		//TextAreaCMD
		txtaCMD.setBounds(35, 39, 494, 301);
		contentPane.add(txtaCMD);
		
		
		//BotonNotepad
		btnNotepad.setBounds(10, 361, 85, 21);
		contentPane.add(btnNotepad);
		
		//BotonPaint
		btnPaint.setBounds(119, 361, 85, 21);
		contentPane.add(btnPaint);
		
		//BotonRejoj
		btnReloj.setBounds(10, 410, 85, 21);
		contentPane.add(btnReloj);
		
		//BotonTerminar
		btnTerminar.setBounds(119, 410, 85, 21);
		contentPane.add(btnTerminar);
		lblProcesosActivos.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		//LabelProcesosActivos
		lblProcesosActivos.setBounds(321, 345, 124, 13);
		contentPane.add(lblProcesosActivos);
		
		//ChoiceProcesosActivos
		ListaProcesos.setBounds(273, 364, 204, 41);
		contentPane.add(ListaProcesos);
		ListaProcesos.setVisible(false);
		
		//HacerVisibleElFrame
		setVisible(true);
	}
	}

