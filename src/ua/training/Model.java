package ua.training;

import java.util.List;

public class Model {

    public String collectInputInSentence(List<String> validUserInputs){
        String result = "";
        for (String s:validUserInputs) {
            result = result + " " + s;
        }
        return result;
    }
}
