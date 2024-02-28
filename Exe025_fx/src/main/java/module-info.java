module org.example.exe025_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.exe025_fx to javafx.fxml;
    exports org.example.exe025_fx;
}