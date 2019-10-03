package klondike.controllers;

import klondike.models.Game;

public class FinishController extends Controller {

    public FinishController(Game game) {
        super(game);
    }

    public boolean isGameFinished() {
        return this.game.isFinished();
    }
}
