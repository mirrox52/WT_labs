package controller;

import controller.command.Command;
import controller.command.impl.*;

enum  CommandName {
    ADD_EDITED_BOOK     (new AddEditedBook()),
    ADD_NEW_BOOK        (new AddNewBook()),
    ADD_READER          (new AddReader()),
    LOGOUT_READER       (new LogoutReader()),
    REGISTRATION_READER (new RegistrationReader()),
    REMOVE_BOOK         (new RemoveBook()),
    SIGN_IN_READER      (new SignInReader()),
    DISPLAY_HELP        (new DisplayHelp());

    private Command command;
    CommandName(Command command){
        this.command = command;
    }

    public Command getCommand(){
        return command;
    }
}