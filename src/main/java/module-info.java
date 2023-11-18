module com.example.java_learnings {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.java_learnings to javafx.fxml;
    exports com.example.java_learnings;
}