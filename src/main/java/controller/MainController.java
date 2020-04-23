package main.java.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import main.java.ui.ClientWindow;

public class MainController {

    @FXML
    private ToggleGroup protocolGroup;
    @FXML
    private ToggleGroup typeGroup;

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void onClickOkButton(ActionEvent event) {
        RadioButton protocolToggle = (RadioButton) protocolGroup.getSelectedToggle();
        RadioButton typeToggle = (RadioButton) typeGroup.getSelectedToggle();
        if (typeToggle.getText().equals("Сервер")) {
            if (protocolToggle.getText().equals("HTTP")) {

            } else if (protocolToggle.getText().equals("POP3")) {

            } else if (protocolToggle.getText().equals("SMTP")) {

            } else {

            }
        } else {
            ClientWindow clientWindow = new ClientWindow();
            if (protocolToggle.getText().equals("HTTP")) {
                clientWindow.setProtocol("HTTP");
            } else if (protocolToggle.getText().equals("POP3")) {
                clientWindow.setProtocol("POP3");
            } else if (protocolToggle.getText().equals("SMTP")) {
                clientWindow.setProtocol("SMTP");
            } else {
                clientWindow.setProtocol("FTP");
            }
            clientWindow.showClientWindow();
        }
        stage.close();
    }
}
