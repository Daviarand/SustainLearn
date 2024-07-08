package Controller;

import java.io.IOException;

import Models.LoginModels;
import Models.RegisterModels;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LoginRegisterController {

    @FXML
    private TextField EmailField;

    @FXML
    private PasswordField PasswordField;

    @FXML
    private TextField UsernameField;

    @FXML
    private TextField UsernameFieldLogin;

    @FXML
    private TextField PasswordFieldLogin;

    @FXML
    private Rectangle layerPenutup;

    @FXML
    private Rectangle layerSembunyiDaftar;

    @FXML
    private Rectangle layerSembunyiMasuk;

    @FXML
    private ImageView logo;

    @FXML
    private ImageView logo1;

    @FXML 
    private Text txDaftar;

    @FXML
    private Text txMasuk;

    @FXML
    public void LoginButton(ActionEvent event) throws IOException {
        String Username = UsernameFieldLogin.getText();
        String Password = PasswordFieldLogin.getText();

        if (Username.isEmpty() || Password.isEmpty()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Login Error");
            alert.setHeaderText(null);
            alert.setContentText("Username or Password is empty!");
            alert.showAndWait();
            return;
        }

        if (LoginModels.login(Username, Password)) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Login Successful");
            alert.setHeaderText(null);
            alert.setContentText("You have successfully logged in!");
            alert.showAndWait();

            try {
                Parent root = FXMLLoader.load(getClass().getResource("/View/HomePage.fxml"));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
                // Opsional: tambahkan logging atau umpan balik kepada pengguna di sini
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Login Error");
            alert.setHeaderText(null);
            alert.setContentText("Login failed. Please check your Username and Password!");
            alert.showAndWait();
        }
    }

    @FXML
    public void RegisterButton(ActionEvent event) throws IOException {
        String Username = UsernameField.getText();
        String Email = EmailField.getText();
        String Password = PasswordField.getText();

        if (Username.isEmpty() || Email.isEmpty() || Password.isEmpty()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Registration Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all fields!");
            alert.showAndWait();
            return;
        }

        if (RegisterModels.insertData(0, Username, Email, Password)) {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Registration Successful");
            alert.setHeaderText(null);
            alert.setContentText("Registration successful! You can now log in.");
            alert.showAndWait();

            try {
                Parent root = FXMLLoader.load(getClass().getResource("/View/LoginRegister.fxml"));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
                // Opsional: tambahkan logging atau umpan balik kepada pengguna di sini
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Registration Failed");
            alert.setHeaderText(null);
            alert.setContentText("Registration failed. Please try again later.");
            alert.showAndWait();
        }
    }

    @FXML
    private void WarnaDaftarMasuk(MouseEvent event) {
        txDaftar.setFill(Color.BLUE);
    }

    @FXML
    private void WarnaDaftarKeluar(MouseEvent event) {
        txDaftar.setFill(Color.BLACK);
    }

    @FXML
    private void WarnaMasukMasuk(MouseEvent event) {
        txMasuk.setFill(Color.BLUE);
    }

    @FXML
    private void WarnaMasukKeluar(MouseEvent event) {
        txMasuk.setFill(Color.BLACK);
    }

    @FXML
    private void PindahDaftar(MouseEvent event) {
        layerSembunyiMasuk.setVisible(true);
        TranslateTransition slideLayer = new TranslateTransition();
        slideLayer.setDuration(Duration.seconds(0.7));
        slideLayer.setNode(layerPenutup);
        slideLayer.setToX(365);
        slideLayer.play();

        TranslateTransition slideLogo = new TranslateTransition();
        slideLogo.setDuration(Duration.seconds(0.7));
        slideLogo.setNode(logo);
        slideLogo.setToX(365);
        slideLogo.play();

        TranslateTransition slideLogo1 = new TranslateTransition();
        slideLogo1.setDuration(Duration.seconds(0.7));
        slideLogo1.setNode(logo1);
        slideLogo1.setToX(365);
        slideLogo1.play();

        FadeTransition keDaftar = new FadeTransition(Duration.seconds(0.5), layerSembunyiMasuk);
        keDaftar.setFromValue(0);
        keDaftar.setToValue(1);
        keDaftar.play();

        layerSembunyiDaftar.setVisible(false);
    }

    @FXML
    private void PindahMasuk(MouseEvent event) {
        layerSembunyiDaftar.setVisible(true);
        TranslateTransition slideLayer = new TranslateTransition();
        slideLayer.setDuration(Duration.seconds(0.7));
        slideLayer.setNode(layerPenutup);
        slideLayer.setToX(0);
        slideLayer.play();

        TranslateTransition slideLogo = new TranslateTransition();
        slideLogo.setDuration(Duration.seconds(0.7));
        slideLogo.setNode(logo);
        slideLogo.setToX(0);
        slideLogo.play();

        TranslateTransition slideLogo1 = new TranslateTransition();
        slideLogo1.setDuration(Duration.seconds(0.7));
        slideLogo1.setNode(logo1);
        slideLogo1.setToX(0);
        slideLogo1.play();

        FadeTransition keMasuk = new FadeTransition(Duration.seconds(0.5), layerSembunyiDaftar);
        keMasuk.setFromValue(0);
        keMasuk.setToValue(1);
        keMasuk.play();

        layerSembunyiMasuk.setVisible(false);
    }
}
