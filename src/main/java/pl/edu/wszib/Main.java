package pl.edu.wszib;

import pl.edu.wszib.CUI.UserInterface;
import pl.edu.wszib.db.DBConnector;
import pl.edu.wszib.model.Product;

public class Main {
    public static void main(String[] args) {
        DBConnector.connect();

        UserInterface userInterface = new UserInterface();
        for (;;) {
            userInterface.ShowInterface();
        }
    }
}
