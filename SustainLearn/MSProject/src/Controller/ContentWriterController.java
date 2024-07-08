package Controller;

import java.io.File;
import java.sql.SQLException;

import Models.ArtikelDOA;
import Models.ModelArtikel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

public class ContentWriterController {

    @FXML
    private TextArea deskripsi;

    @FXML
    private ImageView image;

    @FXML
    private TextField judul;

    @FXML
    private TextField namaPenulis;

    @FXML
    private Button uploadImage;

    private String filePathGambar = null; // Tambahkan variabel ini
    private String fileNameGambar = null; // Tambahkan variabel ini
    private long fileSizeGambar = 0; // Tambahkan variabel ini

    @FXML
    void handleUploadImage(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose Image File");

        // Set extension filter
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Image files (.png, *.jpg, *.jpeg)",
                ".png", ".jpg", ".jpeg");
        fileChooser.getExtensionFilters().add(extFilter);

        // Show open file dialog
        File file = fileChooser.showOpenDialog(null);

        if (file != null) {
            try {
                // Load the selected image file into ImageView
                Image selectedImage = new Image(file.toURI().toString());
                image.setImage(selectedImage);

                // Simpan informasi file yang diupload
                filePathGambar = file.getAbsolutePath();
                fileNameGambar = file.getName();
                fileSizeGambar = file.length();
            } catch (Exception e) {
                e.printStackTrace();
                // Handle errors loading image here
            }
        }
    }

    @FXML
    void tblSave(ActionEvent event) {
        // Ambil data dari UI
        String title = judul.getText();
        String author = namaPenulis.getText();
        String description = deskripsi.getText();

        // Buat objek ModelArtikel baru
        ModelArtikel artikel = new ModelArtikel(title, description, author, filePathGambar, fileNameGambar,
                fileSizeGambar);

        // Simpan artikel ke database
        try {
            ArtikelDOA.saveArtikel(artikel);
            System.out.println("Artikel berhasil disimpan.");
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle SQLException
        }
    }

    @FXML
    void tblUpload(ActionEvent event) {
        // Implementasi untuk tblUpload (jika diperlukan)
    }
}
