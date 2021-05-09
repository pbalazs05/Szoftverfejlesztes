package hu.unideb.inf;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import hu.unideb.inf.controller.FXMLSceneController;
import hu.unideb.inf.model.Komponensek;
import javafx.application.Application;
import static javafx.application.Application.launch;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import org.h2.tools.Server;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MainApp extends Application {

    private static void startDatabase() throws SQLException {
        s.runTool("-tcp", "-web", "-ifNotExists");
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */

    private static Server s = new Server();

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLScene.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("PC-Builder");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args) {
        try {
            startDatabase();
        } catch (SQLException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        launch(args);
        stopDatabase();

        System.out.println("Fut a program: ");
        System.out.println("elérésiut: http://localhost:8082/");
    }

    private static void stopDatabase()  {
        s.shutdown();
    }
    
}
