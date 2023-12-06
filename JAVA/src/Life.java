import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Life {
    private ImageView imageView;

    public Life(String filePath, double positionX, double positionY) {
        Image lifeImage = new Image("file:/" + filePath);
        this.imageView = new ImageView(lifeImage);

        //On isole 1 coeur
        final int SPRITE_WIDTH = 150;
        final int SPRITE_HEIGHT = 150;
        final int SPRITE_X = 660; // La position X du sprite sur la feuille
        final int SPRITE_Y = 150; // La position Y du sprite sur la feuille

        // Définir la partie de l'image (sprite) à afficher pour la vie
        this.imageView.setViewport(new Rectangle2D(SPRITE_X, SPRITE_Y, SPRITE_WIDTH, SPRITE_HEIGHT));

        // Positionner l'icône de vie sur la scène
        this.imageView.setX(positionX);
        this.imageView.setY(positionY);
    }

    public ImageView getImageView() {
        return imageView;
    }
}
