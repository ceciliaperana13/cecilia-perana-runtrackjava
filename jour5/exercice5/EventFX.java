package jour5.exercice5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EventFX extends Application {

    @Override
    public void start(Stage stage) {
        FlowPane root = new FlowPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(20));

        Label label = new Label("Nom :");
        TextField textField = new TextField();
        Button btnEnvoyer = new Button("Envoyer");

        // Événement : affiche le nom dans la console au clic
        btnEnvoyer.setOnAction(e -> {
            String nom = textField.getText();
            if (nom.isEmpty()) {
                System.out.println("Aucun nom entré !");
            } else {
                System.out.println("Nom entré : " + nom);
            }
        });

        root.getChildren().addAll(label, textField, btnEnvoyer);

        Scene scene = new Scene(root, 400, 200);
        stage.setTitle("Événement JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}