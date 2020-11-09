package ua.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private Scanner scanner = new Scanner(System.in);
    private String userInput;
    private boolean isUserInputValid = false;
    private List<String> validUserInput = new ArrayList<>();


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processInput() {
        checkAndSaveValidInputInList(View.INPUT_PATTERN1);
         isUserInputValid = false;
         checkAndSaveValidInputInList(View.INPUT_PATTERN2);
         view.showFinalMessage(model.collectInputInSentence(validUserInput));
        }


    private String getUserInput() {
        return scanner.nextLine();
    }

    private void checkAndSaveValidInputInList(String inputPattern) {
        while (!isUserInputValid) {
            view.askUserForInput(inputPattern);
            userInput = getUserInput();
            if (userInput.matches(inputPattern)) {
                validUserInput.add(userInput);
                isUserInputValid = true;
            }
        }
    }
}
