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

    private boolean[] cardsShown = new boolean[LOTERIA_CARDS.length];
    private int cardsDrawn = 0;
    @Override
    public void start(Stage stage) throws IOException {
//        COMPONENTS

        Label titleLabel = new Label("Welcome to EChALE STEM Loteria!");
        ImageView cardImageView = new ImageView();
        Label messageLabel = new Label("Las matematicas");
        Button drawCardButton = new Button("Draw Random Card");
        ProgressBar gameProgressBar = new ProgressBar(0);
        VBox vbox = new VBox(10, titleLabel, cardImageView, messageLabel, drawCardButton, gameProgressBar);

        Scene scene = new Scene(vbox,350,500);
        stage.setTitle("EChALE STEM LOTERIA");
        stage.setScene(scene);
        stage.show();

//        STYLING

        titleLabel.setStyle("-fx-font-size: 20px");
        cardImageView.setFitHeight(280);
        cardImageView.setFitHeight(300);
        messageLabel.setStyle("-fx-font-size: 15px");
        vbox.setStyle("-fx-alignment: center; -fx-padding: 15px");

//         EVENT HANDLER
        drawCardButton.setOnAction(event -> {
            if (cardsDrawn < LOTERIA_CARDS.length) {
                int randomIdx;

                do {
                    randomIdx = (int) (Math.random() * LOTERIA_CARDS.length);
                } while (cardsShown[randomIdx]);

                LoteriaCard card = LOTERIA_CARDS[randomIdx];
                cardImageView.setImage(card.getImage());

            }
        });

    }

    public static void main(String[] args) {
        launch();
    }
}