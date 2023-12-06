import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class AnimatedThing {
    protected double x;
    protected double y;
    protected ImageView imageView;
    private static final int FRAME_WIDTH = 75;
    private static final int FRAME_HEIGHT = 100;

    public AnimatedThing(String fileName, double x, double y) {
        this.x = x;
        this.y = y;
        Image spriteSheet = new Image("file:/" + fileName);
        imageView = new ImageView(spriteSheet);
        // Initialisation du viewport pour le premier sprite
        imageView.setViewport(new Rectangle2D(0, 0, FRAME_WIDTH, FRAME_HEIGHT));
    }

    public ImageView getImageView() {
        return imageView;
    }
}

