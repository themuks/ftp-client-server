package main.java.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import main.java.controller.MainController;

import java.io.File;

public class MainWindow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/resources/view/mainLayout.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setResizable(false);
        stage.setTitle("Выбор протокола");
        MainController controller = loader.getController();
        controller.setStage(stage);
        stage.getIcons().add(new Image("/main/resources/image/logo.png"));
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        /*if (server != null) {
            server.stop();
        }*/
    }
}