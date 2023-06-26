package factoryPattern;

import factoryPattern.creator.JSONMessageCreator;
import factoryPattern.creator.MessageCreator;
import factoryPattern.creator.TextMessageCreator;

public class Main {

    public static void main(String[] args) {

        MessageCreator jsonMessage = new JSONMessageCreator();
        MessageCreator textMessage = new TextMessageCreator();

        Client.printMessage(jsonMessage);
        Client.printMessage(textMessage);
    }
}
