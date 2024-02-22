package com.service.jw_project_front.controller;

import com.service.jw_project_front.service.TimeService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import java.util.Objects;

public class HomeController {

    @FXML
    private StackPane centerPane;

    @FXML
    private Label timeLabel;
    public void initialize(){
        TimeService.viewTime(timeLabel);
        loadPage();
    }

    @FXML
    public void comeBackHome(){
            centerPane.getChildren().remove(0);
            loadPage();
    }

    public void loadPage() {
        try{
            Parent parent = FXMLLoader.load(
                    Objects.requireNonNull(getClass()
                            .getClassLoader()
                            .getResource("com/service/jw_project_front/main_stack_page.fxml")));
            centerPane.getChildren().add(parent);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}