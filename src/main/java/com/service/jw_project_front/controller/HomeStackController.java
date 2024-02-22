package com.service.jw_project_front.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.util.Objects;


public class HomeStackController {

    @FXML
    private StackPane stackPane;

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
            stackPane.getChildren().remove(0);
            Parent sub = FXMLLoader.load(Objects.requireNonNull(
                    getClass().getResource("/com/service/jw_project_front/" + page + ".fxml")));
            stackPane.getChildren().add(sub);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
