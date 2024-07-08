package Models;

public class ModelArtikel {
    private String judulArtikel;
    private String deskripsi;
    private String penulis;
    private String filePathGambar;
    private String fileNameGambar;
    private long fileSizeGambar;

    public ModelArtikel(String judulArtikel, String deskripsi, String penulis, String filePathGambar, String fileNameGambar, long fileSizeGambar) {
        this.judulArtikel = judulArtikel;
        this.deskripsi = deskripsi;
        this.penulis = penulis;
        this.filePathGambar = filePathGambar;
        this.fileNameGambar = fileNameGambar;
        this.fileSizeGambar = fileSizeGambar;
    }

    // Getter methods
    public String getJudulArtikel() { return judulArtikel; }
    public String getDeskripsi() { return deskripsi; }
    public String getPenulis() { return penulis; }
    public String getFilePathGambar() { return filePathGambar; }
    public String getFileNameGambar() { return fileNameGambar; }
    public long getFileSizeGambar() { return fileSizeGambar; }
}
