package keanu.minesweeper;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import keanu.minesweeper.model.MainMenu;
import keanu.minesweeper.view.mainMenu.MainMenuPresenter;
import keanu.minesweeper.view.mainMenu.MainMenuView;

import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        MainMenu model = new MainMenu();
        MainMenuView view = new MainMenuView();
        MainMenuPresenter presenter = new MainMenuPresenter(model, view);
        Scene scene = new Scene(view);
        primaryStage.setScene(scene);
        presenter.addWindowEventHandlers();
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
