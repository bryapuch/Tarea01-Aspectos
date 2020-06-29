package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Ventana {
	
	private VBox root = new VBox(10);
	private Button btAzul = new Button("Azul");
	private Button btRojo = new Button("Rojo");
	private Button btAmarillo = new Button("Amarillo");
	
	public Ventana() {
		btRojo();
		btAzul();
		btAmarillo();
		Controles();
	}
	
	private void Controles() {
		//
		root.setSpacing(15);
		//
		root.setAlignment(Pos.CENTER);
		//
		root.getChildren().addAll(btAzul,btRojo,btAmarillo);
		//Cambio de tama�o de boton azul
		btAzul.setPrefSize(100, 20);
		//Cambio de tama�o de boton rojo
		btRojo.setPrefSize(100, 20);
		//Cambio de tama�o de boton amarillo
		btAmarillo.setPrefSize(100,20);
	
		
	}	

	
	public VBox getRoot() {
		return root;
	}
	
	private void btAzul() {
		//Cambio de color de fondo blue
		btAzul.setOnAction(e-> root.setStyle("-fx-background-color:BLUE"));
		//listeners
		btAzul.textProperty().addListener((s, oldValue, newValue) -> {
	            System.out.println("Se esta cambiando de color de fondo");
	    });
		
	}
	
	public void btRojo() {
		
		//Cambio de Color de fondo red
		btRojo.setOnAction(e-> root.setStyle("-fx-background-color:RED"));
		
	}
	
	private void btAmarillo() {
		//Cambio de color de fondo yellow
		btAmarillo.setOnAction(e-> root.setStyle("-fx-background-color: yellow"));
	}

	
}
