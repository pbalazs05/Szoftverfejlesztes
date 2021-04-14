package hu.unideb.inf;

import hu.unideb.inf.org.example.JpaKomponensek_DAO;
import hu.unideb.inf.org.example.Komponensek;
import hu.unideb.inf.org.example.Komponensek_DAO;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.h2.tools.Server;

import java.sql.SQLException;

public class MainApp extends Application {

    private static void startDatabase() throws SQLException {
        new Server().runTool("-tcp", "-web", "-ifNotExists");
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLScene.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("PC-Builder");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws  Exception {

        launch(args);
        startDatabase();

        Komponensek card = new Komponensek();

        try(Komponensek_DAO Vdao = new JpaKomponensek_DAO()){
          /*  List<Komponensek> lista = new ArrayList<Komponensek>();
            while ((input = br.readLine())!=null){
                card = new Komponensek();
                String[] tomb =input.split(";");

                card.setKp_Id(tomb[0]);
                card.setName(tomb[1]);
                card.setPrice(Integer.parseInt(tomb[2]));
                card.setPiece(Integer.parseInt(tomb[3]));

                lista.add(card);*/
            Vdao.updateKomponensek(card);
            // }
        }

        System.out.println("Fut a program: ");
        System.out.println("elérésiut: http://localhost:8082/");
    }

}
