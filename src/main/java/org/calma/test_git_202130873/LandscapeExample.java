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

        // Dessiner le dromadaire
        drawCamel(gc, 250, 460);

        // Ajouter le canevas à la scène
        root.getChildren().add(canvas);

        // Créer la scène et la fenêtre
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Paysage en JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Méthode pour dessiner un dromadaire
    private void drawCamel(GraphicsContext gc, double x, double y) {
        // Corps du dromadaire (ellipse)
        gc.setFill(Color.BROWN);
        gc.fillOval(x, y, 120, 60);  // Corps du dromadaire

        // Tête du dromadaire (cercle)
        gc.setFill(Color.BROWN);
        gc.fillOval(x + 100, y - 20, 40, 40);  // Tête

        // Bosse du dromadaire (ovale)
        gc.setFill(Color.BROWN);
        gc.fillOval(x + 30, y - 40, 60, 40);  // Bosse

        // Pattes du dromadaire (rectangles)
        gc.setFill(Color.BROWN);
        gc.fillRect(x + 30, y + 60, 10, 40);  // Patte avant gauche
        gc.fillRect(x + 50, y + 60, 10, 40);  // Patte avant droite
        gc.fillRect(x + 70, y + 60, 10, 40);  // Patte arrière gauche
        gc.fillRect(x + 90, y + 60, 10, 40);  // Patte arrière droite

        // Cou du dromadaire (ligne courbée)
        gc.setStroke(Color.BROWN);
        gc.setLineWidth(5);
        gc.strokeLine(x + 120, y + 10, x + 140, y - 10);  // Cou

        // Yeux du dromadaire (cercles)
        gc.setFill(Color.BLACK);
        gc.fillOval(x + 110, y - 10, 5, 5);  // Oeil

        // Queue du dromadaire (ligne courbée)
        gc.setStroke(Color.BROWN);
        gc.setLineWidth(3);
        gc.strokeLine(x, y + 90, x - 20, y + 110);  // Queue
    }
}
