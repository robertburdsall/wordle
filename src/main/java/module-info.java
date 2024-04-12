module burdsall.wordlefx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens burdsall.wordlefx to javafx.fxml;
    exports burdsall.wordlefx;
}