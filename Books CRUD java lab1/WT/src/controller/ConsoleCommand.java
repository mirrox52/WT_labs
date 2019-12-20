package controller;

import java.util.HashMap;
import java.util.Map;

import static controller.CommandName.*;


public enum ConsoleCommand {
    A(1, "add edited book", ADD_EDITED_BOOK),
    B(2, "add new book", ADD_NEW_BOOK),
    C(3, "add reader", ADD_READER),
    D(4, "display help", DISPLAY_HELP),
    E(5, "logout reader", LOGOUT_READER),
    F(6, "registration reader", REGISTRATION_READER),
    G(7, "remove book", REMOVE_BOOK),
    H(8, "sign in reader", SIGN_IN_READER);

    private String message;
    private int number;
    private CommandName commandName;

    ConsoleCommand(int number, String message, CommandName commandName){
        this.number = number;
        this.message = message;
        this.commandName = commandName;
    }

    public int getNumber() {
        return number;
    }

    public String getMessage() {
        return message;
    }

    public CommandName getCommandName() {
        return commandName;
    }

    private static final Map<Integer, ConsoleCommand> lookup = new HashMap<>();

    static {
        for (ConsoleCommand cc : ConsoleCommand.values()) {
            lookup.put(cc.number, cc);
        }
    }

    public static CommandName getCommandTypeByNumber(int number) {
        ConsoleCommand ct = lookup.get(number);
        return ct == null ? DISPLAY_HELP : ct.getCommandName();
    }
}

