package klondike.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffReader implements Reader {

    private BufferedReader bufferedReader;

    public BuffReader(){
        this.bufferedReader = new BufferedReader(new InputStreamReader(
                System.in));
    }

    @Override
    public String read() throws IOException {
        return bufferedReader.readLine();
    }
}
