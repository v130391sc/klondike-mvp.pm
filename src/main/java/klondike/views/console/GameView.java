package klondike.views.console;

import klondike.controllers.Controller;
import klondike.models.Game;
import klondike.models.Suit;
import klondike.utils.IO;

public class GameView {


    private final Controller controller;

    public GameView(Controller controller) {
        this.controller = controller;
    }

    public void writeln() {
        IO io = new IO();
        io.writeln();
        io.writeln(Message.GAME_TITLE);
        new StockView(this.controller).writeln();
        new WasteView(this.controller).writeln();
        io.writeln(Message.FOUNDATIONS_TITLE);
        for (Suit suit : Suit.values()) {
            new FoundationView(this.controller, suit).writeln();
        }
        io.writeln(Message.PILES_TITLE);
        for (int i = 0; i < Game.NUMBER_OF_PILES; i++) {
            new PileView(this.controller, i).writeln();
        }
        io.writeln(Message.GAME_END);
        io.writeln();
    }
}
