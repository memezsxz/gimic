module gg.game {
    requires javafx.controls;
    requires javafx.fxml;


    opens gg.game to javafx.fxml;
    exports gg.game;
}