package klondike.views.console.menu;

import klondike.models.Suit;
import klondike.utils.IO;

public class SuitReader {

    public static Suit read() {
        IO io = new IO();
        char initial = io.readChar(Message.READ_SUIT, Suit.initials());
        return Suit.find(initial);
    }
}
