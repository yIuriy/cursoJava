module org.example.exe015 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.exe015 to javafx.fxml;
    exports org.example.exe015;
}