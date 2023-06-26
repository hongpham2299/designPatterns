package abstractFactory.product;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Represents a concrete product in a family "Google Cloud Platform"
public class GoogleCloudStorage implements Storage {

    Logger logger = LogManager.getLogger(GoogleCloudStorage.class.getName());

    public GoogleCloudStorage(int capacityInMib){
        //Use GCP API
        logger.info("Allocated " + capacityInMib + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "GCPCS1";
    }

    @Override
    public String toString() {
        return "Google Cloud Storage ";
    }
}
