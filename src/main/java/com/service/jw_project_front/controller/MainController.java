package com.service.jw_project_front.controller;

import com.service.jw_project_front.service.TimeService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Button move;

    @FXML
    private Label timeLabel;

    public void initialize() {
        TimeService.viewTime(timeLabel);
    }

    @FXML
    public void movePage() {
        try {
//            Parent sub = FXMLLoader.load(Objects.requireNonNull(
//                getClass().getClassLoader()
//                    .getResource("com/service/jw_project_front/second.fxml")));
//            // 씬에 추가
//            Scene scene = new Scene(sub,600,800);
//            // 씬을 스테이지에 추가
//            //Stage stage = (Stage) btn.getScene().getWindow();
//            Stage stage = new Stage();
//            stage.setScene(scene);
//            // 스테이지 설정
//            stage.setTitle("서브페이지");
//            stage.setResizable(false);
//            // 스테이지 보여주기
//            stage.show();
//            Stage root = (Stage) move.getScene().getWindow(); //현재 윈도우를 가져온다는 뜻
//            root.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}