package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class NewStage {

    //Функция для создания нового окна, вынес в отдельный класс, так как очень часто используется
    public static void createStage(Button button, String fxmlName, boolean isModal) {
        if (!isModal) {
            button.getScene().getWindow().hide();
        }
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(NewStage.class.getResource(fxmlName));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
}

