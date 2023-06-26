package factoryPattern.product;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
    This class represent abstraction for our "product" which is a message
    Implementations will be specific to content type
 */
public abstract class Message {

    Logger logger = LogManager.getLogger(Message.class.getName());

    public abstract String getContent();

    public void addDefaultHeaders(){
        logger.info("Add default headers to message");
    }

    public void encrypt(){
        logger.info("Message encrypt");
    }
}
