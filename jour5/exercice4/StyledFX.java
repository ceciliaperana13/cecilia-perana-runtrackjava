package jour5.exercice4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class StyledFX extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: #2b2b2b;");

        // Titre en haut
        Label titre = new Label("✨ Mon Application");
        titre.setStyle("-fx-text-fill: white; -fx-font-size: 20px; -fx-font-weight: bold; -fx-padding: 15px;");
        root.setTop(titre);
        BorderPane.setAlignment(titre, Pos.CENTER);

        // FlowPane au centre
        FlowPane centre = new FlowPane();
        centre.setHgap(10);
        centre.setVgap(10);
        centre.setPadding(new Insets(20));
        centre.setAlignment(Pos.CENTER);

        Label label = new Label("Nom :");
        label.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");

        TextField textField = new TextField();
        textField.setPromptText("Entrez votre nom...");
        textField.setStyle("-fx-background-color: #3c3f41; -fx-text-fill: white; -fx-border-color: #555; -fx-border-radius: 5; -fx-background-radius: 5;");

        Button btnEnvoyer = new Button("Envoyer");
        btnEnvoyer.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold; -fx-border-radius: 5; -fx-background-radius: 5; -fx-cursor: hand;");
        btnEnvoyer.setOnAction(e -> System.out.println("Nom : " + textField.getText()));

        centre.getChildren().addAll(label, textField, btnEnvoyer);
        root.setCenter(centre);

        // Bouton Quitter en bas
        Button btnQuitter = new Button("Quitter");
        btnQuitter.setStyle("-fx-background-color: #e53935; -fx-text-fill: white; -fx-font-weight: bold; -fx-border-radius: 5; -fx-background-radius: 5; -fx-cursor: hand;");
        btnQuitter.setOnAction(e -> stage.close());

        FlowPane bas = new FlowPane();
        bas.setAlignment(Pos.CENTER);
        bas.setPadding(new Insets(15));
        bas.getChildren().add(btnQuitter);
        bas.setStyle("-fx-background-color: #1e1e1e;");
        root.setBottom(bas);

        Scene scene = new Scene(root, 450, 300);
        stage.setTitle("Application Stylisée");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}