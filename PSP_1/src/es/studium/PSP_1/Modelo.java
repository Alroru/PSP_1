package es.studium.PSP_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JTextArea;


public class Modelo 
{ 	//ProcesosARealizar
	Process p1;
	Process p2;
	Process p3;
	Process p4;
	Vista vista;
	public void  metodocmd(String comando,JTextArea txtaCMD) 
	{
		try 
		{
			p1 = Runtime.getRuntime().exec("cmd /c " + comando);
			// Flujo de entrada(padre) para la salida estándar (hijo)
			InputStream is = p1.getInputStream();
			//Flujo de lectura para esa entrada
			InputStreamReader isr = new InputStreamReader(is);
			//Buffer para leer línea a línea
			BufferedReader br = new BufferedReader(isr);
			String line;
			txtaCMD.append("Salida del proceso: ");
			while ((line = br.readLine()) != null) 
			{
				txtaCMD.append(line + "\n" );
			}
			is.close();
		}
		catch (IOException e) 
		{

			System.exit(-1);
		}
	}
	public void crearNotepad() 
	{
		try {
			p2 = Runtime.getRuntime().exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void crearPaint() 
	{
		try {
			p3 = Runtime.getRuntime().exec("mspaint");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void crearReloj() 
	{
		try {
			p4 = Runtime.getRuntime().exec("java -jar C:\\Users\\Alejandro\\Desktop\\Programacion_Informatica\\Programas\\PSP_1\\Reloj.jar");
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void destruirNotepad()
	{
		p2.destroy();
	}
	public void destruirPaint()
	{
		p3.destroy();
	}
	public void destruirReloj()
	{
		p4.destroy();
	}
	
}








