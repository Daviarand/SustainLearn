package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import Models.ModelArtikel;

public class TemplateDraft {

    @FXML
    private ImageView image;

    @FXML
    private Label judul;

    @FXML
    private Label penulis;

    public void setData(ModelArtikel artikel) {
        judul.setText(artikel.getJudulArtikel());
        penulis.setText(artikel.getPenulis());

        if (artikel.getFilePathGambar() != null && !artikel.getFilePathGambar().isEmpty()) {
            Image img = new Image("file:" + artikel.getFilePathGambar());
            image.setImage(img);
        }
    }
}
