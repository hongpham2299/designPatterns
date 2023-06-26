package factoryPattern;

import factoryPattern.creator.MessageCreator;
import factoryPattern.product.Message;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client {

    static Logger logger = LogManager.getLogger(Client.class.getName());
    public static void printMessage(MessageCreator creator) {
        Message message = creator.getMessage();

        logger.info(message);
    }
}