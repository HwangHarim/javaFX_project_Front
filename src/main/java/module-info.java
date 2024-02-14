module com.service.jw_project_front {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.service.jw_project_front to javafx.fxml;
    exports com.service.jw_project_front;
    exports com.service.jw_project_front.controller;
    opens com.service.jw_project_front.controller to javafx.fxml;
}