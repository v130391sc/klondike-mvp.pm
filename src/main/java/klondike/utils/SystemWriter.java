package klondike.utils;

public class SystemWriter implements Writer {

    public void writeln() {
        System.out.println();
    }

    public void write(String string) {
        System.out.print(string);
    }

    public void writeln(String string) {
        System.out.println(string);
    }

    public void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
