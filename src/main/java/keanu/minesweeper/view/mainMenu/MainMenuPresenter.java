package keanu.minesweeper.view.mainMenu;

import keanu.minesweeper.model.MainMenu;

public class MainMenuPresenter {
    private MainMenu model;
    private MainMenuView view;

    public MainMenuPresenter(MainMenu model, MainMenuView view) {
        this.model = model;
        this.view = view;
        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {

    }

    private void updateView() {

    }

    public void addWindowEventHandlers() {

    }
}
