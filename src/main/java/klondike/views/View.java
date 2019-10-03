package klondike.views;

import klondike.controllers.FinishController;
import klondike.controllers.MoveController;
import klondike.controllers.ResumeController;
import klondike.controllers.StartController;

public abstract class View {

    protected StartController startController;

    protected MoveController moveController;

    protected ResumeController resumeController;

    protected FinishController finishController;

    public View(StartController startController, MoveController moveController, ResumeController resumeController, FinishController finishController) {
        this.startController = startController;
        this.moveController = moveController;
        this.resumeController = resumeController;
        this.finishController = finishController;
    }

    public void interact() {
        boolean resume;
        do {
            this.start();
            boolean finished;
            do {
                this.move();
                finished = finishController.isGameFinished();
            } while (!finished);
            resume = this.resume();
            if (resume) resumeController.resume();
        } while (resume);
    }

    protected abstract void start();

    protected abstract void move();

    protected abstract boolean resume();
}
