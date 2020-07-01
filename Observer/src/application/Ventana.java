package application;

import java.util.Observable;
import java.util.Observer;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Ventana extends Observable{
	
	private VBox root = new VBox(10);
	private Button btAzul = new Button("Azul");
	private Button btRojo = new Button("Rojo");
	private Button btAmarillo = new Button("Amarillo");
	private Button btInicio = new Button("Iniciar");
	Usuario us;
	
	private Observer observer;
	
	public Ventana() {
		Controles();
		btAzul.setOnMouseClicked(e-> {cambiofondo(btAzul.getText());
								System.out.println(btAzul.getText());});
		btRojo.setOnMouseClicked(e-> {cambiofondo(btRojo.getText());
								System.out.println(btRojo.getText());});
		btAmarillo.setOnMouseClicked(e-> {cambiofondo(btAmarillo.getText());
								System.out.println(btAmarillo.getText());});
		btInicio.setOnMouseClicked(e-> Inicio());
	}
	
	private void Controles() {
		//
		root.setSpacing(15);
		//
		root.setAlignment(Pos.CENTER);
		//
		root.getChildren().addAll(btAzul,btRojo,btAmarillo,btInicio);
		//Cambio de tamaño de boton azul
		btAzul.setPrefSize(100, 20);
		//Cambio de tamaño de boton rojo
		btRojo.setPrefSize(100, 20);
		//Cambio de tamaño de boton amarillo
		btAmarillo.setPrefSize(100,20);
		//Cambio de tamano de Boton Inicio
		btInicio.setPrefSize(100,20);
	}	

	
	public VBox getRoot() {
		return root;
	}
	
	private void cambiofondo(String s) {
		VBox rt = getRoot();
		if(s == "Azul") {
			rt.setStyle("-fx-background-color:BLUE");
			//texto = "Azul";
		}else if (s == "Rojo") {
			rt.setStyle("-fx-background-color:RED");
			//texto = "Rojo";
		}else {
			rt.setStyle("-fx-background-color: yellow");
			//texto = "Amarillo";
		}
		notifyObservers();
		
	}
	private void Inicio() {
		if(btInicio.isPressed() == false) {
			System.out.println("Exito");	
		}
	}
	

	@Override
	public void addObserver(Observer observer) {
		this.observer = observer;
	}
	@Override
	public void notifyObservers() {
		if(observer instanceof Usuario)
			observer.update(this, "fondo");
	}
	
} 