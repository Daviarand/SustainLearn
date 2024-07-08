package Controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class ConsultantBusinessController {
    private void navigateTo(ActionEvent event, String fxmlPath) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Optionally add some logging or user feedback here
        }
    }

    @FXML
    public void showSend(ActionEvent event) throws IOException {
        System.out.println("");
        navigateTo(event, "View/Consultation.fxml");
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Berhasil ^ ^");

        alert.showAndWait();
    }
}
