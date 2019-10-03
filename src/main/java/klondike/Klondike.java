package klondike;

import klondike.controllers.FinishController;
import klondike.controllers.MoveController;
import klondike.controllers.ResumeController;
import klondike.controllers.StartController;
import klondike.models.Game;
import klondike.views.View;
import klondike.views.console.ConsoleView;

public class Klondike {

    private final StartController startController;
    private final MoveController moveController;
    private final ResumeController resumeController;
    private final FinishController finishController;
    private View view;
    private Game game;

    private Klondike() {
        this.game = new Game();
        this.startController = new StartController(this.game);
        this.moveController = new MoveController(this.game);
        this.resumeController = new ResumeController(this.game);
        this.finishController = new FinishController(this.game);
        this.view = new ConsoleView(startController, moveController, resumeController, finishController);
    }

    public static void main(String[] args) {
        new Klondike().play();
    }

    public void play() {
        view.interact();
    }
}