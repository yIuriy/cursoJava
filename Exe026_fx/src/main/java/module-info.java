module org.example.exe026_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens org.example.exe026_fx to javafx.fxml;
    exports org.example.exe026_fx;
}