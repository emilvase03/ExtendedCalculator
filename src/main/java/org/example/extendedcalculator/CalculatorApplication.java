package org.example.extendedcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculatorApplication.class.getResource("/views/MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 245, 400);
        stage.setScene(scene);
        stage.setTitle("Extended Calculator");
        stage.setResizable(false);
        stage.show();
    }
}
