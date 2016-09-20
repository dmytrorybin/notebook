package ua.epam;

import java.util.ArrayList;

/**
 * Created by Dmytro_Rybin on 9/20/2016.
 */
public class View {
    private ArrayList<String> outputList = new ArrayList<>();

    public static final String INVALID_MESSAGE = "Wrong Input, Try again";

    public View() {
        createOutputMessages();
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printStartMessage(int number) {
        System.out.println(outputList.get(number));
    }

    private void createOutputMessages() {

        outputList.add("Input name: ");
        outputList.add("Input second name: ");
        outputList.add("Input third name name: ");
        outputList.add("Input nickname: ");
        outputList.add("Input comment:");
        outputList.add("Input group: ");
        outputList.add("Input home number: ");
        outputList.add("Input first cell number:");
        outputList.add("Input second cell number: ");
        outputList.add("Input e-mail: ");
        outputList.add("Input skype: ");
        outputList.add("Input zip code: ");
        outputList.add("Input town: ");
        outputList.add("Input street: ");
        outputList.add("Input building number: ");
        outputList.add("Input apartment number: ");
        outputList.add("Input creation date: ");
        outputList.add("Input modify date: ");

    }
}
