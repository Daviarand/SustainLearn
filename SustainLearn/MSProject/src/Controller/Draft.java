package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Models.ArtikelDOA;
import Models.ModelArtikel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class Draft {

    @FXML
    private AnchorPane anchorpane;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private VBox vbox;

    @FXML
    public void initialize() {
        try {
            // Mengambil daftar artikel dari database
            List<ModelArtikel> artikels = ArtikelDOA.getAllArtikels();

            // Memuat setiap artikel ke dalam template dan menambahkannya ke VBox
            for (ModelArtikel artikel : artikels) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("View/TemplateDraft.fxml")); // Pastikan path benar
                AnchorPane draftPane = loader.load();

                TemplateDraft controller = loader.getController();
                controller.setData(artikel);

                vbox.getChildren().add(draftPane);
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
            // Handle exceptions
        }
    }
}
