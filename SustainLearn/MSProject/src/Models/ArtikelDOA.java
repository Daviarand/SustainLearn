package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utility.JDBCConnection;

public class ArtikelDOA {

    // Method untuk menyimpan artikel baru ke database
    public static void saveArtikel(ModelArtikel artikel) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = JDBCConnection.getConnection();

            String query = "INSERT INTO tblartikel (judulArtikel, deskripsi, penulis, file_Path_Gambar, file_Size_Gambar, file_Name_Gambar) " +
                           "VALUES (?, ?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, artikel.getJudulArtikel());
            stmt.setString(2, artikel.getDeskripsi());
            stmt.setString(3, artikel.getPenulis());
            stmt.setString(4, artikel.getFilePathGambar());
            stmt.setLong(5, artikel.getFileSizeGambar());
            stmt.setString(6, artikel.getFileNameGambar());

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error while saving article: " + e.getMessage());
            e.printStackTrace();
            throw e;
        } finally {
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }
    }

        // Method untuk mengambil daftar artikel dari database
    public static List<ModelArtikel> getAllArtikels() throws SQLException {
        List<ModelArtikel> artikels = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCConnection.getConnection();

            String query = "SELECT judulArtikel, deskripsi, penulis, file_Path_Gambar, file_Size_Gambar, file_Name_Gambar FROM tblartikel";
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next()) {
                String judulArtikel = rs.getString("judulArtikel");
                String deskripsi = rs.getString("deskripsi");
                String penulis = rs.getString("penulis");
                String filePathGambar = rs.getString("file_Path_Gambar");
                String fileNameGambar = rs.getString("file_Name_Gambar");
                long fileSizeGambar = rs.getLong("file_Size_Gambar");

                ModelArtikel artikel = new ModelArtikel(judulArtikel, deskripsi, penulis, filePathGambar, fileNameGambar, fileSizeGambar);
                artikels.add(artikel);
            }

        } catch (SQLException e) {
            System.err.println("Error while fetching articles: " + e.getMessage());
            e.printStackTrace();
            throw e;
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }

        return artikels;
    }
}
