package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button btMyTest;
	
	@FXML
	public void onBtMyTestAction() {
		Alerts.showAlert("Alert title", null, "Hello", AlertType.ERROR);
	}

}
