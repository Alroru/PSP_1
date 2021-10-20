package es.studium.PSP_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
	Vista vista;
	Modelo modelo;
	
	public Controlador(Vista v, Modelo m)
	{
		this.vista=v;
		this.modelo=m;
		this.vista.btnNotepad.addActionListener(this);
		this.vista.btnPaint.addActionListener(this);
		this.vista.btnReloj.addActionListener(this);
		this.vista.btnTerminar.addActionListener(this);
		this.vista.btnEjecutar.addActionListener(this);
	}



	public void actionPerformed(ActionEvent evento) 
	{
		Object e= evento.getSource();
		if(e.equals(vista.btnNotepad))
		{
			modelo.crearNotepad();
			vista.ListaProcesos.add("Notepad");
			vista.ListaProcesos.setVisible(true);
			vista.btnNotepad.setEnabled(false);
		
		}
		else if(e.equals(vista.btnPaint))
		{
			modelo.crearPaint();
			vista.ListaProcesos.add("Paint");
			vista.ListaProcesos.setVisible(true);
			vista.btnPaint.setEnabled(false);
			
		}
		else if(e.equals(vista.btnReloj))
		{
			modelo.crearReloj();
			vista.ListaProcesos.add("Reloj");
			vista.ListaProcesos.setVisible(true);
			vista.btnReloj.setEnabled(false);
		
		}
		else if(e.equals(vista.btnEjecutar))
		{	String comando=vista.txtCmd.getText();
			modelo.metodocmd(comando,vista.txtaCMD);
		
		}
		else if(e.equals(vista.btnTerminar))
		{
			String destruccion=vista.ListaProcesos.getSelectedItem();
			if(destruccion=="Notepad")
			{
			modelo.destruirNotepad();
			vista.ListaProcesos.remove("Notepad");
			vista.btnNotepad.setEnabled(true);
			}
			
			else if(destruccion=="Paint") 
			{
			modelo.destruirPaint();
			vista.ListaProcesos.remove("Paint");
			vista.btnPaint.setEnabled(true);
			}
			else if(destruccion=="Reloj") 
			{
			modelo.destruirReloj();
			vista.ListaProcesos.remove("Reloj");
			vista.btnReloj.setEnabled(true);
			}
			
			
		}

	}
}
