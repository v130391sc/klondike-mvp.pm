package klondike.utils;

import java.util.ArrayList;

public abstract class Menu {

    private static final String OPTION = "Choose an option: ";
    private ArrayList<Command> commandList;

    public Menu() {
        this.commandList = new ArrayList<Command>();
    }

    public void execute() {
        ArrayList<Command> commands = new ArrayList<Command>();
        for (int i = 0; i < this.commandList.size(); i++) {
            commands.add(this.commandList.get(i));
        }
        boolean error;
        int option;
        do {
            IO io = new IO();
            error = false;
            for (int i = 0; i < commands.size(); i++) {
                io.writeln((i + 1) + ") " + commands.get(i).getTitle());
            }
            io.write(OPTION);
            option = io.readInt("") - 1;
            if (!new ClosedInterval(0, commands.size() - 1).includes(option)) {
                error = true;
            }
            io.writeln();
        } while (error);
        commands.get(option).execute();
    }

    protected void addCommand(Command command) {
        this.commandList.add(command);
    }

}
