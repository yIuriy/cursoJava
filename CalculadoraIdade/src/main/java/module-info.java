module org.example.calculadoraidade {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.calculadoraidade to javafx.fxml;
    exports org.example.calculadoraidade;
}