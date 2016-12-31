package mooc.logic;

import mooc.ui.UserInterface;

/**
 * Created by anastasia on 31/12/2016.
 */
public class ApplicationLogic {

    private UserInterface userInterface;

    public ApplicationLogic(UserInterface ui) {
        userInterface = ui;

    }

    public void execute(int howManyTimes) {
        for (int i = 0; i < howManyTimes; i++) {
            System.out.println("The application logic works");
            this.userInterface.update();
        }
    }

}
