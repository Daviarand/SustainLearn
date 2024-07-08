package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class PopUpController {

    @FXML
    private Label labelMessage;

    public void setMessage(String message) {
        labelMessage.setText("City :" + message);
    }

    @FXML
    private void closePopUp() {
        Stage stage = (Stage) labelMessage.getScene().getWindow();
        stage.close();
    }
}