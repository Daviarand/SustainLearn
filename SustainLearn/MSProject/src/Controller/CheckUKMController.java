package Controller;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CheckUKMController {

    @FXML
    private ComboBox<String> pilihKab;

    @FXML
    private Label labelMessage;

    @FXML
    private void initialize() {
        ObservableList<String> choices = FXCollections.observableArrayList(
                "Yogyakarta",
                "Sleman",
                "Bantul",
                "Gunung Kidul",
                "Kulon Progo");
        pilihKab.setItems(choices);
    }

    @FXML
    private void showKab() {
        String selectedCity = pilihKab.getSelectionModel().getSelectedItem();
        labelMessage.setText("Kategori: " + selectedCity);
        showPopUp(selectedCity);
    }

    @FXML
    private void btnSearch(ActionEvent event) {
        // Your logic to determine the message to display
        String message = "Yogyakarta";
        showPopUp(message);
    }

    private void showPopUp(String message) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/PopUp.fxml"));
            Parent root = loader.load();
            PopUpController popUpController = loader.getController();
            popUpController.setMessage(message);

            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("City Selected");
            stage.setScene(new Scene(root));
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void HomePage(ActionEvent event) throws IOException {
        loadFXML("/View/HomePage.fxml", event);
    }

    @FXML
    public void CheckUKM(ActionEvent event) throws IOException {
        loadFXML("/View/CheckUKM.fxml", event);
    }

    @FXML
    public void Courses(ActionEvent event) throws IOException {
        loadFXML("/View/Courses.fxml", event);
    }

    @FXML
    public void Consultation(ActionEvent event) throws IOException {
        loadFXML("/View/Consultation.fxml", event);
    }

    @FXML
    public void Article(ActionEvent event) throws IOException {
        loadFXML("/View/Article.fxml", event);
    }

    @FXML
    public void About(ActionEvent event) throws IOException {
        loadFXML("/View/About.fxml", event);
    }

    @FXML
    public void Profile(ActionEvent event) throws IOException {
        loadFXML("/View/Profile.fxml", event);
    }

    private void loadFXML(String fxml, ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxml));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
