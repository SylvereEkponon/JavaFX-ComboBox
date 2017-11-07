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
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class MainController implements Initializable{

	@FXML
	public Label myLabel;
	
	@FXML
	public ComboBox<String> combobox;
	
	@FXML
	public ListView<String> myListView;
	
	ObservableList<String> list = FXCollections.observableArrayList("Mark","Tom","John", "Jack");
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//myListView.setItems(list);
		myListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		//combobox.setItems(list);
	}

	public void comboChanged(ActionEvent event) {
		myLabel.setText(combobox.getValue());

	}
	public void btnChanged(ActionEvent event) {
		//myLabel.setText(combobox.getValue());
		//myListView.getItems().addAll("Sylvere","Anupom","Krishna","Bishnu","Syed");

		ObservableList<String> names;
		names = myListView.getSelectionModel().getSelectedItems();
		for (String name : names) {
			System.out.println(name);
			
		}
	}
}
