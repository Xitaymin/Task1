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
        while (!isUserInputValid){
        userInput = getUserInput();
            if(userInput.matches(view.getINPUT_PATTERN1())){
                validUserInput.add(userInput);
            }
        userInput = getUserInput();
            if(userInput.matches(view.getINPUT_PATTERN2())){
                validUserInput.add(userInput);
            }

        }

    }

    private String getUserInput() {
        return scanner.nextLine();
    }
}
