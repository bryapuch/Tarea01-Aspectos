package AspectJ;

import java.util.Observable;

import application.Ventana;
import javafx.scene.layout.VBox;

public aspect Botones {

	pointcut success() : call(* cambio*(..) );
    after() : success() {
    //Aspecto ejemplo: solo muestra este mensaje después de haber creado un usuario 
    	Ventana vn = new Ventana();
    	String temp = vn.getTexto();
   
    	System.out.println(temp);
    }


}
