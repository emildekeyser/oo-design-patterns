package application;

import java.net.URL;
import java.util.ResourceBundle;

import domain.Level;
import domain.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class Controller implements Initializable
{
	Logger logger;
	
	@FXML private TextArea message;
	@FXML private ComboBox<Level> level;

	
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		this.logger = new Logger();
		
		ObservableList<Level> cblist = FXCollections.observableArrayList();
		for(Level l : Level.values())
		{
			cblist.add(l);
		}
		this.level.setItems(cblist);
		this.level.getSelectionModel().selectFirst();
		
		this.message.setText("tester testert");
	}

	@FXML
	public void handleSend()
	{
		Level lvl = this.level.getValue();
		String msg = this.message.getText();
		this.logger.Log(lvl, msg);
	}
}
