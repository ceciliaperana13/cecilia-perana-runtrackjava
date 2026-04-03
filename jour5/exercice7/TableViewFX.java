package jour5.exercice7;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import java.io.FileWriter;
import java.io.IOException;

public class TableViewFX extends Application {

    // Classe interne pour représenter une personne
    public static class Personne {
        private String nom;
        private String prenom;
        private int age;
        private String ville;

        public Personne(String nom, String prenom, int age, String ville) {
            this.nom = nom;
            this.prenom = prenom;
            this.age = age;
            this.ville = ville;
        }

        public String getNom()    { return nom; }
        public String getPrenom() { return prenom; }
        public int getAge()       { return age; }
        public String getVille()  { return ville; }
    }

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(15));

        // Données
        ObservableList<Personne> data = FXCollections.observableArrayList(
            new Personne("Dupont",  "Alice",  28, "Paris"),
            new Personne("Martin",  "Bob",    35, "Lyon"),
            new Personne("Bernard", "Clara",  22, "Marseille"),
            new Personne("Durand",  "David",  41, "Bordeaux"),
            new Personne("Leroy",   "Emma",   30, "Nantes")
        );

        // Colonnes
        TableColumn<Personne, String> colNom    = new TableColumn<>("Nom");
        colNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        colNom.setPrefWidth(120);

        TableColumn<Personne, String> colPrenom = new TableColumn<>("Prénom");
        colPrenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        colPrenom.setPrefWidth(120);

        TableColumn<Personne, Integer> colAge   = new TableColumn<>("Âge");
        colAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        colAge.setPrefWidth(80);

        TableColumn<Personne, String> colVille  = new TableColumn<>("Ville");
        colVille.setCellValueFactory(new PropertyValueFactory<>("ville"));
        colVille.setPrefWidth(130);

        // TableView
        TableView<Personne> table = new TableView<>(data);
        table.getColumns().addAll(colNom, colPrenom, colAge, colVille);
        root.setCenter(table);

        // Bouton Exporter
        Button btnExporter = new Button("Exporter CSV");
        btnExporter.setStyle("-fx-background-color: #21ecf3; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 5;");
        btnExporter.setOnAction(e -> exporterCSV(data));

        FlowPane bas = new FlowPane();
        bas.setAlignment(Pos.CENTER);
        bas.setPadding(new Insets(10, 0, 0, 0));
        bas.getChildren().add(btnExporter);
        root.setBottom(bas);

        Scene scene = new Scene(root, 500, 350);
        stage.setTitle("Tableau de données");
        stage.setScene(scene);
        stage.show();
    }

    private void exporterCSV(ObservableList<Personne> data) {
        String fichier = "export.csv";
        try (FileWriter writer = new FileWriter(fichier)) {
            writer.write("Nom,Prénom,Âge,Ville\n");
            for (Personne p : data) {
                writer.write(p.getNom() + "," + p.getPrenom() + "," + p.getAge() + "," + p.getVille() + "\n");
            }
            System.out.println(" Export réussi : " + fichier);
        } catch (IOException ex) {
            System.out.println("Erreur export : " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }
}