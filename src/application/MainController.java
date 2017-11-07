package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class MainController implements Initializable{

	@FXML
	public Label myLabel;
	
	@FXML
	public ComboBox<String> combobox;
	
	ObservableList<String> list = FXCollections.observableArrayList("Mark","Tom","John", "Jack");
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		combobox.setItems(list);
	}

	public void comboChanged(ActionEvent event) {
		myLabel.setText(combobox.getValue());

	}
}
