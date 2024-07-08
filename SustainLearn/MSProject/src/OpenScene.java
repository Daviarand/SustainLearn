import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OpenScene {

    public void showLoginRegisterScene(Node node) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("View/LoginRegister.fxml"));
            Parent nextPage = loader.load();

            Stage stage = (Stage) node.getScene().getWindow();
            Scene scene = new Scene(nextPage);
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("Error in showLoginScene: " + e.getMessage());
            e.printStackTrace();
        }
    }


    public void ShowHomePageScene(Node node) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("View/HomePage.fxml"));
            Parent nextPage = loader.load();

            Stage stage = (Stage) node.getScene().getWindow();
            Scene scene = new Scene(nextPage);
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("Error in showLoginScene: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void ShowCheckUKMScene(Node node) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("View/CheckUKM.fxml"));
            Parent nextPage = loader.load();

            Stage stage = (Stage) node.getScene().getWindow();
            Scene scene = new Scene(nextPage);
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("Error in showLoginScene: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void ShowCoursesScene(Node node) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("View/Courses.fxml"));
            Parent nextPage = loader.load();

            Stage stage = (Stage) node.getScene().getWindow();
            Scene scene = new Scene(nextPage);
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("Error in showLoginScene: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void ShowConsultationScene(Node node) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("View/Consultation.fxml"));
            Parent nextPage = loader.load();

            Stage stage = (Stage) node.getScene().getWindow();
            Scene scene = new Scene(nextPage);
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("Error in showLoginScene: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void ShowArticleScene(Node node) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("View/Article.fxml"));
            Parent nextPage = loader.load();

            Stage stage = (Stage) node.getScene().getWindow();
            Scene scene = new Scene(nextPage);
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("Error in showLoginScene: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void ShowAboutScene(Node node) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("View/About.fxml"));
            Parent nextPage = loader.load();

            Stage stage = (Stage) node.getScene().getWindow();
            Scene scene = new Scene(nextPage);
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("Error in showLoginScene: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void ShowProfileScene(Node node) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("View/Profile.fxml"));
            Parent nextPage = loader.load();

            Stage stage = (Stage) node.getScene().getWindow();
            Scene scene = new Scene(nextPage);
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("Error in showLoginScene: " + e.getMessage());
            e.printStackTrace();
        }
    }

    
}