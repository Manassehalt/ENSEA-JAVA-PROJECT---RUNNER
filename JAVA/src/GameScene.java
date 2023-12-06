import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class GameScene extends Scene {
    private Camera camera;
    private AnimatedThing hero;

    public GameScene(Pane root, double width, double height, Camera camera, AnimatedThing hero) {
        super(root, width, height);
        this.camera = camera;
        this.hero = hero;

        // Initialiser le timer d'animation
        //AnimationTimer timer = new AnimationTimer() {
        //    public void handle(long now) {
        //        hero.update(now);
        //        camera.update(now);
        //        render();
        //    }
        //};
        //timer.start();
    }

    // Méthode pour mettre à jour la scène en fonction de la position de la caméra
    public void render() {
    }
}





