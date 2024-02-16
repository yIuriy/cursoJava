module org.example.exe009 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.exe009 to javafx.fxml;
    exports org.example.exe009;
}