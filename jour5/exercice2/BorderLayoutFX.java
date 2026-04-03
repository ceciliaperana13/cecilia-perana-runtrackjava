package jour5.exercice2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderLayoutFX extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();

        // Centre
        Label label = new Label("Contenu principal");
        root.setCenter(label);
        BorderPane.setAlignment(label, Pos.CENTER);

        // Bas - bouton Quitter
        Button btnQuitter = new Button("Quitter");
        btnQuitter.setOnAction(e -> stage.close());
        root.setBottom(btnQuitter);
        BorderPane.setAlignment(btnQuitter, Pos.CENTER);

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("BorderPane Layout");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}