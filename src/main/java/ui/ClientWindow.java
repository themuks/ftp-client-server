package main.java.ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import main.java.controller.ClientController;
import main.java.controller.MainController;

import java.io.IOException;

public class ClientWindow {

    private String protocol;
    private Stage stage = new Stage();

    public ClientWindow() {
        prepareStage();
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    private void prepareStage() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/resources/view/clientLayout.fxml"));
        try {
            stage.setScene(new Scene(loader.load()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setResizable(false);
        stage.getIcons().add(new Image("/main/resources/image/logo.png"));
        ClientController controller = loader.getController();
        controller.setStage(stage);
    }

    public void showClientWindow() {
        stage.setTitle(protocol + " клиент");
        stage.show();
    }
}
