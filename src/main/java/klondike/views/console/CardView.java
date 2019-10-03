package klondike.views.console;

import klondike.models.Card;
import klondike.utils.IO;

public class CardView {

    private final Card card;

    CardView(Card card) {
        this.card = card;
    }

    public void write() {
        IO io = new IO();
        String number = this.card.isFacedUp() ? this.card.getNumber().toString().toLowerCase() : Message.FACE_DOWN;
        String suit = this.card.isFacedUp() ? this.card.getSuit().toString().toLowerCase() : Message.FACE_DOWN;
        String output = Message.CARD_FORMAT.replace(Message.NUMBER_TAG, number).replace(Message.SUIT_TAG, suit);
        io.write(output);
    }

    public void writeln() {
        IO io = new IO();
        this.write();
        io.writeln();
    }
}
