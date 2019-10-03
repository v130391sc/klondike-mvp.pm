package klondike.views.console.menu;

import klondike.utils.ClosedInterval;
import klondike.utils.IO;

public class PileReader {

    public static int readIndex(String title) {
        IO io = new IO();
        return io.readInt(Message.READ_PILE_INDEX.replace(Message.TITLE_TAG, title), new ClosedInterval(1, 7)) - 1;
    }
}
