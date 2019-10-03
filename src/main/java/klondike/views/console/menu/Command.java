package klondike.views.console.menu;

import klondike.controllers.MoveController;
import klondike.models.Error;
import klondike.utils.IO;

public abstract class Command {

    protected MoveController moveController;

    private String title;

    protected Command(String title, MoveController moveController) {
        this.title = title;
        this.moveController = moveController;
    }

    public void execute() {
        Error error = this.move();
        if (error != null) {
            IO io = new IO();
            io.writeError(Message.INVALID_MOVE, error.getMessage());
        }
    }

    protected abstract Error move();

    public String getTitle() {
        return this.title;
    }
}
