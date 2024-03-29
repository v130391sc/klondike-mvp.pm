package klondike.views.console;

import klondike.controllers.Controller;
import klondike.models.Card;
import klondike.utils.IO;

public abstract class CardStackView {

    protected final Controller controller;

    private final String title;

    CardStackView(Controller controller, String title) {
        this.controller = controller;
        this.title = title;
    }

    protected void writeln(Card card) {
        IO io = new IO();
        io.write(title);
        if (card == null)
            io.writeln(Message.EMPTY);
        else
            new CardView(card).writeln();
    }

    public abstract void writeln();
}
