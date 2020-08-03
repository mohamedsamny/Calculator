/**
 * Sample Skeleton for 'calculator.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="numberOne"
    private Button numberOne; // Value injected by FXMLLoader

    @FXML // fx:id="numberTwo"
    private Button numberTwo; // Value injected by FXMLLoader

    @FXML // fx:id="numberThree"
    private Button numberThree; // Value injected by FXMLLoader

    @FXML // fx:id="numberFour"
    private Button numberFour; // Value injected by FXMLLoader

    @FXML // fx:id="numberFive"
    private Button numberFive; // Value injected by FXMLLoader

    @FXML // fx:id="numberSix"
    private Button numberSix; // Value injected by FXMLLoader

    @FXML // fx:id="numberSeven"
    private Button numberSeven; // Value injected by FXMLLoader

    @FXML // fx:id="numberEight"
    private Button numberEight; // Value injected by FXMLLoader

    @FXML // fx:id="numberNine"
    private Button numberNine; // Value injected by FXMLLoader

    @FXML // fx:id="numberZero"
    private Button numberZero; // Value injected by FXMLLoader

    @FXML // fx:id="equal"
    private Button equal; // Value injected by FXMLLoader

    @FXML // fx:id="clear"
    private Button clear; // Value injected by FXMLLoader

    @FXML // fx:id="add"
    private Button add; // Value injected by FXMLLoader

    @FXML // fx:id="subtract"
    private Button subtract; // Value injected by FXMLLoader

    @FXML // fx:id="multiply"
    private Button multiply; // Value injected by FXMLLoader

    @FXML // fx:id="divide"
    private Button divide; // Value injected by FXMLLoader
    
    @FXML // fx:id="squareRoot"
    private Button squareRoot; // Value injected by FXMLLoader

    @FXML // fx:id="square"
    private Button square; // Value injected by FXMLLoader

    @FXML // fx:id="decimal"
    private Button decimal; // Value injected by FXMLLoader

    @FXML // fx:id="mod"
    private Button mod; // Value injected by FXMLLoader


    @FXML // fx:id="display"
    private TextField display; // Value injected by FXMLLoader

    
    Float previousOperation = 0f ;	//previous value
    String operation  ;
    Float result;

    @FXML
    void handleButtonAction(ActionEvent event) {
    	//if number from 0-9 is chosen display it
    	if (event.getSource() == numberOne) {
    		display.setText(display.getText() + "1");
    	}else if(event.getSource() == numberTwo) {
    		display.setText(display.getText() + "2");
    	}else if(event.getSource() == numberThree) {
    		display.setText(display.getText() + "3");
    	}else if(event.getSource() == numberFour) {
    		display.setText(display.getText() + "4");
    	}else if(event.getSource() == numberFive) {
    		display.setText(display.getText() + "5");
    	}else if(event.getSource() == numberSix) {
    		display.setText(display.getText() + "6");
    	}else if(event.getSource() == numberSeven) {
    		display.setText(display.getText() + "7");
    	}else if(event.getSource() == numberEight) {
    		display.setText(display.getText() + "8");
    	}else if(event.getSource() == numberNine) {
    		display.setText(display.getText() + "9");
	    }else if(event.getSource() == numberZero) {
    		display.setText(display.getText() + "0");
	    }else if(event.getSource() == decimal) {
	    	display.setText(display.getText() + ".");	    	
	    }else if(event.getSource() == clear) {
    		display.setText(" ");
    		
    		
	    }else if(event.getSource() == add) {	//add operation
    		previousOperation = Float.parseFloat(display.getText());
    		display.setText("");
    		operation = "addition" ;
	    }else if(event.getSource() == subtract) {	// subtract operation
    		previousOperation = Float.parseFloat(display.getText());
    		display.setText("");
    		operation = "subtraction" ;

	    }else if(event.getSource() == multiply) {	//multiplication operation
    		previousOperation = Float.parseFloat(display.getText());
    		display.setText("");
    		operation = "multiplication" ;

	    }else if(event.getSource() == divide) {	//divison operation
    		previousOperation = Float.parseFloat(display.getText());
    		display.setText("");
    		operation = "division" ;
    		
	    }else if(event.getSource() == square) {	//double operation
    		previousOperation = Float.parseFloat(display.getText());
    		String s = Double.toString(Math.pow(previousOperation, 2));
    		result = Float.parseFloat(s);
    		display.setText(String.valueOf(result));
    		
	    }else if(event.getSource() == squareRoot) {	//square root operation
	    	
    		previousOperation = Float.parseFloat(display.getText());
    		double x = (double)previousOperation;
	    	double result = Math.sqrt(x);
    		display.setText(String.valueOf(result));

	    }else if(event.getSource() == mod) {	//module operation
    		previousOperation = Float.parseFloat(display.getText());
    		display.setText("");
    		operation = "mod" ;
	    
    		

    		// on pressing equal use the previous and current value to display result
	    }else if(event.getSource() == equal) {
    		Float currentOperation = Float.parseFloat(display.getText());
    		
    		if(operation == "addition") {
        		 result = previousOperation + currentOperation ;
        		display.setText(String.valueOf(result));
    			
    		}else if(operation == "subtraction") {
        		 result = previousOperation - currentOperation ;
        		display.setText(String.valueOf(result));
    	    	
    		}else if(operation == "multiplication") {
        		 result = previousOperation * currentOperation ;
        		display.setText(String.valueOf(result));
    			
    		}else if(operation == "division") {
    			
    			if(currentOperation == 0) {
    				display.setText("Math Error");
    			}else {    	 			   				
    				result = previousOperation / currentOperation ;
    				display.setText(String.valueOf(result));
    			}
    		}else if(operation == "mod") {
    			 result = previousOperation % currentOperation ;
         		display.setText(String.valueOf(result));
     			
    		}
    		
	    }

    }
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert numberOne != null : "fx:id=\"numberOne\" was not injected: check your FXML file 'Sample.fxml'.";
        assert numberTwo != null : "fx:id=\"numberTwo\" was not injected: check your FXML file 'Sample.fxml'.";
        assert numberThree != null : "fx:id=\"numberThree\" was not injected: check your FXML file 'Sample.fxml'.";
        assert numberFour != null : "fx:id=\"numberFour\" was not injected: check your FXML file 'Sample.fxml'.";
        assert numberFive != null : "fx:id=\"numberFive\" was not injected: check your FXML file 'Sample.fxml'.";
        assert numberSix != null : "fx:id=\"numberSix\" was not injected: check your FXML file 'Sample.fxml'.";
        assert numberSeven != null : "fx:id=\"numberSeven\" was not injected: check your FXML file 'Sample.fxml'.";
        assert numberEight != null : "fx:id=\"numberEight\" was not injected: check your FXML file 'Sample.fxml'.";
        assert numberNine != null : "fx:id=\"numberNine\" was not injected: check your FXML file 'Sample.fxml'.";
        assert numberZero != null : "fx:id=\"numberZero\" was not injected: check your FXML file 'Sample.fxml'.";
        assert equal != null : "fx:id=\"equal\" was not injected: check your FXML file 'Sample.fxml'.";
        assert clear != null : "fx:id=\"clear\" was not injected: check your FXML file 'Sample.fxml'.";
        assert add != null : "fx:id=\"add\" was not injected: check your FXML file 'Sample.fxml'.";
        assert subtract != null : "fx:id=\"subtract\" was not injected: check your FXML file 'Sample.fxml'.";
        assert multiply != null : "fx:id=\"multiply\" was not injected: check your FXML file 'Sample.fxml'.";
        assert divide != null : "fx:id=\"divide\" was not injected: check your FXML file 'Sample.fxml'.";
        assert display != null : "fx:id=\"display\" was not injected: check your FXML file 'Sample.fxml'.";

    }

}
