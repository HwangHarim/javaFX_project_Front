package com.service.jw_project_front.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class TimeService {

    public static String getNowTime(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatterDAY = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분");
        return now.format(formatterDAY);
    }

    public static void viewTime(Label timeLabel){
        Timeline timeline = new Timeline(
            new KeyFrame(Duration.seconds(0),
            actionEvent -> timeLabel.setText(getNowTime())),
            new KeyFrame(Duration.seconds(1))
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}
