module org.example.exe023_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.exe023_fx to javafx.fxml;
    exports org.example.exe023_fx;
}