module org.example.exe022_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.exe022_fx to javafx.fxml;
    exports org.example.exe022_fx;
}