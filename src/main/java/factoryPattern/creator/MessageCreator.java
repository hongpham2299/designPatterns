package factoryPattern.creator;

import factoryPattern.product.Message;

/*
    This is abstract "creator"
    The abstract method createMessage() has to be implemented by its subclasses
 */
public abstract class MessageCreator {

    public Message getMessage(){
        Message message = createMessage();
        message.addDefaultHeaders();
        message.encrypt();
        return message;
    }

    //This is our Factory Method
    public abstract Message createMessage();
}