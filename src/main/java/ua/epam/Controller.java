package ua.epam;

import ua.epam.Resources.Groups;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Dmytro_Rybin on 9/20/2016.
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scan = new Scanner(System.in);
        String userInput;

        int outputMessageNumber = 0;
        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("[A-Za-z]{1,20}+")) {
                model.setNoteRecordName(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }

        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("[A-Za-z]{1,20}+")) {
                model.setNoteRecordSecondName(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }

        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("[A-Za-z]{1,20}+")) {
                model.setNoteRecordThirdName(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }

        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("^[A-Za-z][A-Za-z0-9._-]{3,20}$")) {
                model.setNoteRecordNickname(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }

        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("^[a-zA-Z0-9._-]{3,100}$")) {
                model.setNoteRecordComment(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }


        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("[A-Za-z]{1,20}+")) {
                model.setNoteRecordGroup(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }

        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})")) {
                model.setNoteRecordHomeTel(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }

        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})")) {
                model.setNoteRecordCellTel1(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }

        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})")) {
                model.setNoteRecordCellTel2(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }

        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")) {
                model.setNoteRecordEmail(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }

        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("^[A-Za-z][A-Za-z0-9._-]{3,20}$")) {
                model.setNoteRecordSkype(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }

        ArrayList<String> address = new ArrayList<>();

        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("[0-9]{3,8}")) {
                address.add(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }

            while (true) {
                view.printStartMessage(outputMessageNumber);
                userInput = scan.nextLine();
                if (userInput.matches("[A-Za-z]{3,20}")) {
                    address.add(userInput);
                    outputMessageNumber++;
                    break;
                } else {
                    view.printMessage(view.INVALID_MESSAGE);
                }
            }

        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("[A-Za-z]{3,20}")) {
                address.add(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }

        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("[0-9]{1,3}")) {
                address.add(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }

        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("[0-9]{1,4}")) {
                address.add(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }
  //      }
        model.setNoteRecordAddress(address);

        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|" +
                    "(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))" +
                    "(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3" +
                    "(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|" +
                    "(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])" +
                    "(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {
                model.setNoteRecordCreationDate(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }

        while (true) {
            view.printStartMessage(outputMessageNumber);
            userInput = scan.nextLine();
            if (userInput.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|" +
                    "(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))" +
                    "(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3" +
                    "(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|" +
                    "(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])" +
                    "(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {
                model.setNoteRecordLastChangesDate(userInput);
                outputMessageNumber++;
                break;
            } else {
                view.printMessage(view.INVALID_MESSAGE);
            }
        }


 //       model.setNoteRecordCreationDate(new Date());
//        model.setNoteRecordLastChangesDate(new Date());

    }
}



