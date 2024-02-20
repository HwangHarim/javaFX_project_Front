package com.service.jw_project_front.controller;

import com.service.jw_project_front.service.TimeService;
import java.io.IOException;
import java.util.Objects;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class MainController {

    @FXML
    private BorderPane main;
    @FXML
    private Label timeLabel;
    @FXML
    private StackPane centerPane;


    private StackPane mainStack;

    public void initialize() throws IOException {
        TimeService.viewTime(timeLabel);
        mainStack = getMainStack();
        centerPane.getChildren().add(mainStack);

    }

    public StackPane getMainStack() throws IOException {
        StackPane stack = null;
        stack = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader()
            .getResource("com/service/jw_project_front/main_stack_page.fxml")));
        return stack;
    }


    /**
     *
     */
    @FXML
    public void moveAutoCookPage() {
        movePage("auto-cook-view");
    }

    @FXML
    public void moveSelfCookPage() {
        movePage("self-cook-view");
    }

    @FXML
    public void moveCleanOvenPage() {
        movePage("clean-oven-view");
    }

    @FXML
    public void moveLogCookPage() {
        movePage("log-cook-view");
    }

    public void movePage(String page) {
        try {
            Pane sub = FXMLLoader.load(Objects.requireNonNull(
                getClass().getClassLoader()
                    .getResource("com/service/jw_project_front/" + page + ".fxml")));
            main.getChildren().add(sub);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}