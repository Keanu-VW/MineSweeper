module keanu.minesweeper {
    requires javafx.controls;
    requires javafx.fxml;


    opens keanu.minesweeper to javafx.fxml;
    exports keanu.minesweeper;
}