package jour5.exercice6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ComboBoxFX extends Application {

    @Override
    public void start(Stage stage) {
        FlowPane root = new FlowPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(20));

        // Liste déroulante des éléments
        Label labelElement = new Label("Élément :");
        ComboBox<String> comboElement = new ComboBox<>();
        comboElement.getItems().addAll("Voiture", "Vélo", "Moto", "Bus", "Train");
        comboElement.setValue("Voiture");

        // Liste déroulante des couleurs
        Label labelCouleur = new Label("Couleur :");
        ComboBox<String> comboCouleur = new ComboBox<>();
        comboCouleur.getItems().addAll("Rouge", "Bleu", "Vert", "Jaune", "Noir");
        comboCouleur.setValue("Rouge");

        // Bouton OK
        Button btnOK = new Button("OK");
        btnOK.setOnAction(e -> {
            String element = comboElement.getValue();
            String couleur = comboCouleur.getValue();
            System.out.println("Élément sélectionné : " + element);
            System.out.println("Couleur sélectionnée : " + couleur);
        });

        root.getChildren().addAll(labelElement, comboElement, labelCouleur, comboCouleur, btnOK);

        Scene scene = new Scene(root, 400, 150);
        stage.setTitle("Listes déroulantes JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}