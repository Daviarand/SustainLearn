package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class ArticleController {

    @FXML
    private ScrollPane kontenSatuPane; // Ubah deklarasi dari Pane ke ScrollPane

    @FXML
    private ToggleButton btnSatu;

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
    public void handlebtnSatu(ActionEvent event) {
        ToggleButton source = (ToggleButton) event.getSource();
        String contentId = (String) source.getUserData();

        kontenSatuPane.setVisible(false);

        if (source.isSelected()) {
            switch (contentId) {
                case "konten1":
                    kontenSatuPane.setVisible(true);
                    kontenSatuPane.setVvalue(0);
                    break;
                case "konten2":
                    
                default:
                    System.out.println("bbbb"+contentId);
            }
        } 
    }

    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        kontenSatuPane.setVisible(false);

        btnSatu.setUserData("konten1");
    }
}
