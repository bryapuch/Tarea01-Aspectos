package AspectJ;



public aspect Botones{

	pointcut success() : call(* cambio*(..) );
    after() : success() {
    //Aspecto ejemplo: solo muestra este mensaje despues de haber cambiado el color de fondo 
    	System.out.println("Color cambiado a: "); 	
    }
    
  
	


}