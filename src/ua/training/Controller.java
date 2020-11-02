package ua.training;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private Scanner scanner = new Scanner(System.in);
    StringBuilder userInput = new StringBuilder();

    public Controller(Model model, View view) {

    }

    public void processInput() {
         userInput.insert(0, getUserInput());

    }

    private String getUserInput() {
        return scanner.nextLine();
    }
}
