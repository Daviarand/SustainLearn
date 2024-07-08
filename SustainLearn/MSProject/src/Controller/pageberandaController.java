package Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class pageberandaController {
    @FXML
    private void handleLoginButton(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View/LoginRegister.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Opsional: tambahkan logging atau umpan balik kepada pengguna di sini
        }
    }
}
