module org.example.exe020_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.exe020_fx to javafx.fxml;
    exports org.example.exe020_fx;
}