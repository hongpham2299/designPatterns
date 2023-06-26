package factoryPattern.creator;

import factoryPattern.product.Message;
import factoryPattern.product.TextMessage;

//Provides implementation for creating Text messages
public class TextMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
