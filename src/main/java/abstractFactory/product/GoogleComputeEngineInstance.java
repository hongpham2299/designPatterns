package abstractFactory.product;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Represents a concrete product in a family "Google Cloud Platform"
public class GoogleComputeEngineInstance implements Instance{

    Logger logger = LogManager.getLogger(GoogleComputeEngineInstance.class.getName());

    public GoogleComputeEngineInstance (Capacity capacity) {
        //Map capacity to GCP compute instance types, use GCP API to provision
        logger.info("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
        logger.info("Google Compute Engine Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        logger.info("Attached " + storage + " to Google Compute Engine Instance");
    }

    @Override
    public void stop() {
        logger.info("Google Compute Engine Instance stopped");
    }

    @Override
    public String toString() {
        return "Google Compute Engine Instance";
    }
}
