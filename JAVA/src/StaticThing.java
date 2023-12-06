import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {
    private double sizeX;
    private double sizeY;
    private ImageView imageView;

    public StaticThing(String filePath, double sizeX, double sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        Image image = new Image("file:/" + filePath);
        imageView = new ImageView(image);
        imageView.setFitWidth(sizeX);
        imageView.setFitHeight(sizeY);
    }

    public ImageView getImageView() {
        return imageView;
    }
}
