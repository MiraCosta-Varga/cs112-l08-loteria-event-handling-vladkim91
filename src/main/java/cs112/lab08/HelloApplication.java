package cs112.lab08;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.image.ImageView;


public class HelloApplication extends Application {

    //CONSTANTS

    //array of LoteriaCards to use for game:
    private static final LoteriaCard[] LOTERIA_CARDS = {
            new LoteriaCard("Las matematicas", "1.png", 1),
            new LoteriaCard("Las ciencias", "2.png", 2),
            new LoteriaCard("La Tecnología", "8.png", 8),
            new LoteriaCard("La ingeniería", "9.png", 9),
    };


    @Override
    public void start(Stage stage) throws IOException {
        Label titleLabel = new Label("Welcome to EChALE STEM Loteria!");
        ImageView cardImageview = new ImageView();
        Label messageLabel = new Label("Las matematicas");
        Button drawCardButton = new Button("Draw Random Card");
        ProgressBar gameProgressBar = new ProgressBar(0);
        VBox vbox = new VBox(10, titleLabel, cardImageview, messageLabel, drawCardButton, gameProgressBar);
        Scene scene = new Scene(vbox,400,600);
        stage.setTitle("EChALE STEM LOTERIA");
        stage.setScene(scene);
        stage.show();

//        STYLING
        titleLabel.setStyle("-fx-font-size: 20px");
        cardImageview.setFitHeight(280);
        cardImageview.setFitHeight(300);
        messageLabel.setStyle("-fx-font-size: 15px");
        vbox.setStyle("-fx-alignment: center; -fx-padding: 15px");

    }

    public static void main(String[] args) {
        launch();
    }
}