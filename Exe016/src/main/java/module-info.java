module org.example.exe016 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.exe016 to javafx.fxml;
    exports org.example.exe016;
}