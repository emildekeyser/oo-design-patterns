package view;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

public class ConverterPanel extends GridPane {
	private TextField decimal;
	private Label is;
	private Label converted;
	
	public ConverterPanel() {
		decimal = new TextField();
		decimal.setPrefWidth(180);
		is = new Label("=");
		is.setAlignment(Pos.CENTER);
		is.setPrefWidth(40);
		converted = new Label();
		converted.setPrefWidth(180);
		add(decimal, 0, 0, 2, 1); 
		add(is, 2, 0); 
		add(converted, 3, 0, 2, 1); 
	}
	
	public int getDecimal(){
		String decimalText = decimal.getText();
		decimalText = decimalText.trim();
		return Integer.parseInt(decimalText);
	}
		
	public void setBinary(String binary){
		this.converted.setText(binary);
	}
	
	public void resetDecimal(){
		decimal.setText("                                            ");
	}
	
	public void addKeyListener(EventHandler<KeyEvent> isHandler){
		decimal.addEventHandler(KeyEvent.KEY_RELEASED, isHandler);
	}
}
