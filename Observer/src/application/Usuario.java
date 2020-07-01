package application;

import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer{
	
	public Usuario() {
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (((String) arg).equals("fondo")) {

		System.out.println("Fondo cambiado");	
		}

	}
}