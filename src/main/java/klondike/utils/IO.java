package klondike.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

    private static final String INTEGER = "Integer";
    private static final String CHARACTER = "Character";
    private static final String STRING = "String";
    private static final String FORMAT_ERROR = "ERROR DE FORMATO! Introduzca un valor con formato ";
    private static final String POINT = ".";
    private static final String TAB = "\t";

    private Reader reader;
    private Writer writer;

    public IO(){
        this.reader = new BuffReader();
        this.writer = new SystemWriter();
    }

    public String readString(String title) {
        String input = null;
        boolean ok = false;
        do {
            this.writer.write(title);
            try {
                input = reader.read();
                ok = true;
            } catch (IOException ex) {
                writeFormatError(STRING);
            }
        } while (!ok);
        return input;
    }

    public int readInt(String title) {
        int input = 0;
        boolean ok = false;
        do {
            try {
                input = Integer.parseInt(readString(title));
                ok = true;
            } catch (NumberFormatException ex) {
                writeFormatError(INTEGER);
            }
        } while (!ok);
        return input;
    }

    public int readInt(String title, ClosedInterval closedInterval) {
        int input = 0;
        boolean ok = false;
        do {
            try {
                input = Integer.parseInt(readString(title));
                ok = closedInterval.includes(input);
            } catch (NumberFormatException ex) {
                writeFormatError(INTEGER);
            }
        } while (!ok);
        return input;
    }

    public char readChar(String title) {
        char charValue = ' ';
        boolean ok = false;
        do {
            String input = readString(title);
            if (input.length() != 1) {
                writeFormatError(CHARACTER);
            } else {
                charValue = input.charAt(0);
                ok = true;
            }
        } while (!ok);
        return charValue;
    }

    public char readChar(String title, char[] options) {
        char charValue = ' ';
        boolean ok = false;
        do {
            String input = readString(title);
            if (input.length() != 1) {
            } else {
                charValue = input.charAt(0);
                ok = (new String(options).indexOf(charValue) != -1);
            }
        } while (!ok);
        return charValue;
    }

    public void writetab() {
        this.writer.writeln(TAB);
    }

    public void writeError(String title, String msg) {
        this.writer.writeln("!!!! " + title.toUpperCase() + ": " + msg);
        this.writer.writeln();
    }

    private void writeFormatError(String format) {
        this.writer.writeln(FORMAT_ERROR + format + POINT);
    }

    public void writeln() {
        this.writer.writeln();
    }

    public void write(String string) {
        this.writer.write(string);
    }

    public void writeln(String string) {
        this.writer.writeln(string);
    }
}
