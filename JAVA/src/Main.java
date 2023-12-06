import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Main extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
                primaryStage.setTitle("Run Baby Run !");

                // Créer le root pane
                Pane root = new Pane();

                // Créer et ajouter le background (désert.png)
                StaticThing backgroundLeft = new StaticThing("C:/Users/nolan/Desktop/ProjetJAVA/img/desert.png", 600, 400);
                root.getChildren().add(backgroundLeft.getImageView());
                StaticThing backgroundRight = new StaticThing("C:/Users/nolan/Desktop/ProjetJAVA/img/desert.png", 600, 400);
                // Positionner le background droit à côté du background gauche
                backgroundRight.getImageView().setLayoutX(600); // Déplacer l'ImageView de droite vers la droite
                root.getChildren().add(backgroundRight.getImageView());

                // Créer et ajouter le héros
                Hero hero = new Hero("C:/Users/nolan/Desktop/ProjetJAVA/img/heros.png", 0, 250);
                root.getChildren().add(hero.getImageView());

                //Créer et ajouter les vies du héros :
                Life heart1 = new Life("C:/Users/nolan/Desktop/ProjetJAVA/img/heart.png",340,20);
                root.getChildren().add(heart1.getImageView());

                Life heart2 = new Life("C:/Users/nolan/Desktop/ProjetJAVA/img/heart.png",200,20);
                root.getChildren().add(heart2.getImageView());

                Life heart3 = new Life("C:/Users/nolan/Desktop/ProjetJAVA/img/heart.png",60,20);
                root.getChildren().add(heart3.getImageView());

                // Créer la scène et ajouter le root pane
                Scene theScene = new Scene(root, 1200, 400, true);
                primaryStage.setScene(theScene);
                primaryStage.show();
        }

        public static void main(String[] args) {
                launch(args);
        }
}

