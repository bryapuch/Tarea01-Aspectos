package AspectJ;

public aspect Inicio {

	pointcut success() : call(* Inicio*(..) );
    before() : success() {
    //Aspecto ejemplo: solo muestra este mensaje despues de haber cambiado el color de fondo 
    	System.out.println("Iniciando Sesion... "); 	
    }
    
  
}
