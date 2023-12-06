import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Hero {
    private ImageView imageView;

    public Hero(String filePath, double positionX, double positionY) {
        Image heroImage = new Image("file:/" + filePath);
        this.imageView = new ImageView(heroImage);

        // On isole un des sprite du héro
        final int SPRITE_WIDTH = 85;
        final int SPRITE_HEIGHT = 100;
        final int SPRITE_X = 0; // La position X du sprite sur la feuille
        final int SPRITE_Y = 0; // La position Y du sprite sur la feuille

        this.imageView.setViewport(new Rectangle2D(SPRITE_X, SPRITE_Y, SPRITE_WIDTH, SPRITE_HEIGHT));

        // Positionner le héros sur la scène
        this.imageView.setX(positionX);
        this.imageView.setY(positionY);
    }

    public ImageView getImageView() {
        return imageView;
    }
}



