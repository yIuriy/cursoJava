module org.example.exe019 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.exe019 to javafx.fxml;
    exports org.example.exe019;
}