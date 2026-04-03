package jour5.exercice3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowLayoutFX extends Application {

    @Override
    public void start(Stage stage) {
        FlowPane root = new FlowPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(20));

        Label label = new Label("Nom :");
        TextField textField = new TextField();
        Button btnEnvoyer = new Button("Envoyer");

        btnEnvoyer.setOnAction(e -> {
            System.out.println("Nom entré : " + textField.getText());
        });

        root.getChildren().addAll(label, textField, btnEnvoyer);

        Scene scene = new Scene(root, 400, 200);
        stage.setTitle("FlowPane Layout");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}