module org.example.exe018 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.exe018 to javafx.fxml;
    exports org.example.exe018;
}