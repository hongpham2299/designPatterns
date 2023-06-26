package abstractFactory.product;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Represents a concrete product in a family "Amazon Web Services"
public class S3Storage implements Storage{

    Logger logger = LogManager.getLogger(S3Storage.class.getName());

    public S3Storage(int capacityInMib){
        //Use AWS S3 API
        logger.info("Allocated " + capacityInMib + " on S3");
    }
    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}
