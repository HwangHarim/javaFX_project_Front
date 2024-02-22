package com.service.jw_project_front;

import java.io.IOException;
import java.util.Objects;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JwFrontApplication extends Application {

    public static StackPane stackPane;
    @Override
    public void start(Stage stage) throws IOException {
        stackPane = FXMLLoader.load(Objects.requireNonNull(JwFrontApplication.class.getResource("home-view.fxml")));
        Scene scene = new Scene(stackPane, 600, 800);
        stage.setTitle("jw-project-front");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}