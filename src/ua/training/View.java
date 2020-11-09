package ua.training;

public class View {
    public static final String INPUT_PATTERN1 = "Hello";
    public static final String INPUT_PATTERN2 = "world";

    public void askUserForInput(String message) {
        System.out.println("Please print " + message);
    }

    public void showFinalMessage(String result){
        System.out.println("Your input is " + result);
    }
}
