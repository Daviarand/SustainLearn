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

public class ConsultationFormController {
    @FXML
    public void HomePage(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View/HomePage.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Opsional: tambahkan logging atau umpan balik kepada pengguna di sini
        }
    }
    

    @FXML
    public void CheckUKM(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View/CheckUKM.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Opsional: tambahkan logging atau umpan balik kepada pengguna di sini
        }
    }


    @FXML
    public void Courses(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View/Courses.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Opsional: tambahkan logging atau umpan balik kepada pengguna di sini
        }
    }
    

    @FXML
    public void Consultation(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View/Consultation.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Opsional: tambahkan logging atau umpan balik kepada pengguna di sini
        }
    }

    @FXML
    public void Article(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View/Article.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Opsional: tambahkan logging atau umpan balik kepada pengguna di sini
        }
    }
    

    @FXML
    public void About(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View/About.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Opsional: tambahkan logging atau umpan balik kepada pengguna di sini
        }
    }

    @FXML
    public void Profile(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View/Profile.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Opsional: tambahkan logging atau umpan balik kepada pengguna di sini
        }
    }

    @FXML
    private void showSend(ActionEvent event) throws IOException {
        // Misalnya, menampilkan Alert
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Terimakasih");
        alert.setHeaderText(null);
        alert.setContentText("Terimakasih telah mengisi form consultation");

        alert.showAndWait();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View/Consultation.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Opsional: tambahkan logging atau umpan balik kepada pengguna di sini
        }
    }

    @FXML
    private void back(ActionEvent event) throws IOException{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/View/Consultation.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Opsional: tambahkan logging atau umpan balik kepada pengguna di sini
        }
    }
    
}
