package com.service.jw_project_front.controller;

import com.service.jw_project_front.service.TimeService;
import java.util.Objects;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class MainController {

    @FXML
    private BorderPane home;
    @FXML
    private Label timeLabel;

    public void initialize() {
        TimeService.viewTime(timeLabel);
    }


    @FXML
    public void moveAutoCookPage(){
        movePage("auto-cook-view");
    }
    @FXML
    public void moveSelfCookPage(){
        movePage("self-cook-view");
    }
    @FXML
    public void moveCleanOvenPage(){
        movePage("clean-oven-view");
    }
    @FXML
    public void moveLogCookPage(){
        movePage("log-cook-view");
    }

    public void movePage(String page) {
        try {
            Parent sub = FXMLLoader.load(Objects.requireNonNull(
                getClass().getClassLoader()
                    .getResource("com/service/jw_project_front/" + page + ".fxml")));
            home.setCenter(sub);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}