package controller.command.impl;

import controller.ConsoleCommand;
import controller.command.Command;

public class DisplayHelp implements Command {
    @Override
    public void execute(){
        for (ConsoleCommand cc : ConsoleCommand.values()) {
            System.out.println(cc.getNumber() + " - " + cc.getMessage());
        }
    }
}
