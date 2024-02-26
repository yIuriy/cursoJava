module org.example.exe021_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.exe021_fx to javafx.fxml;
    exports org.example.exe021_fx;
}