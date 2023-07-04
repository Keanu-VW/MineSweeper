package keanu.minesweeper.view.mainMenu;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

public class MainMenuView extends VBox {
    private ImageView logo;
    private Button startButton;
    private Button difficultyButton;

    public MainMenuView() {
        this.initialiseNodes();
        this.layoutNodes();
        this.createIDs();
        this.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/stylesheets/MainMenuStylesheet.css")).toExternalForm());
    }

    private void initialiseNodes() {
        this.logo = new ImageView("C:\\Users\\Leerling\\Desktop\\Programming\\MineSweeper\\src\\main\\resources\\images\\MineSweeperLogo.png");
        this.startButton = new Button("Start");
        this.difficultyButton = new Button("Difficulty");
    }

    // Custom function that gives each node an ID that is the same as its variable name
    // Can't get the variable name from the node and can't set the ID with the field,
    // So this is a workaround
    private void createIDs() {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                Object fieldValue = field.get(this);
                if (fieldValue instanceof Node) {
                    Node node = (Node) fieldValue;
                    String idName = field.getName();
                    node.setId(idName);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void layoutNodes() {
        this.setSpacing(20);
        this.setPadding(new Insets(20));
        this.getChildren().addAll(logo, startButton, difficultyButton);
        this.setAlignment(Pos.CENTER);
    }

}
