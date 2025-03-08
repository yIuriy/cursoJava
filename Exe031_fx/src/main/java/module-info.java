module org.example.exe031_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.exe031_fx to javafx.fxml;
    exports org.example.exe031_fx;
}