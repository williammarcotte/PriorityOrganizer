module com.example.priorityorganizer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.priorityorganizer to javafx.fxml;
    exports com.example.priorityorganizer;
}