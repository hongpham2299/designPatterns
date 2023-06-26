package factoryPattern.product;

public class JSONMessage extends Message{
    @Override
    public String getContent() {
        return "{\"JSON\":[]}";
    }

    @Override
    public String toString() {
        return "JSONMessage";
    }
}