package burdsall.wordlefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WordleApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(WordleApplication.class.getResource("game.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 500);
        stage.setTitle("Wordle");
        stage.setScene(scene);
        stage.show();


        WordleController controller = fxmlLoader.getController();

        scene.setOnKeyPressed(event -> {
            String keyCode = String.valueOf(event.getCode());
            controller.userinput(keyCode);
        });


    }

    public static void main(String[] args) {
        launch();
    }
}