package org.calma.test_git_202130873;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LandscapeExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Création d'un groupe pour contenir tous les éléments
        Group root = new Group();

        // Création d'un canevas pour dessiner
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Dessiner le ciel (coup de pinceau bleu)
        gc.setFill(Color.CYAN);
        gc.fillRect(0, 0, 800, 400);  // Le ciel occupe la partie supérieure de l'écran

        // Dessiner le sol (coup de pinceau vert)
        gc.setFill(Color.GREEN);
        gc.fillRect(0, 400, 800, 200);  // Le sol occupe la partie inférieure

        // Dessiner des montagnes (formes triangulaires)
        gc.setFill(Color.DARKSLATEGRAY);
        gc.fillPolygon(new double[]{0, 300, 600}, new double[]{400, 200, 400}, 3);  // Première montagne
        gc.fillPolygon(new double[]{200, 500, 800}, new double[]{400, 150, 400}, 3);  // Deuxième montagne

        // Dessiner un soleil (cercle jaune)
        gc.setFill(Color.YELLOW);
        gc.fillOval(600, 50, 100, 100);  // Soleil dans le coin supérieur droit

        // Ajouter le canevas à la scène
        root.getChildren().add(canvas);

        // Créer la scène et la fenêtre
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Paysage en JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
