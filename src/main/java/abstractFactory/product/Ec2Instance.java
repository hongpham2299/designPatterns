package abstractFactory.product;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Represents a concrete product in a family "Amazon Web Services"
public class Ec2Instance implements Instance{

    Logger logger = LogManager.getLogger(Ec2Instance.class.getName());

    public Ec2Instance(Capacity capacity){
        //Map capacity to ec2 instance types, use AWS API to provision
        logger.info("Created Ec2Instance");
    }

    @Override
    public void start() {
        logger.info("Ec2Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        logger.info("Attached " + storage + " to Ec2Instance");
    }

    @Override
    public void stop() {
        logger.info("Ec2Instance stopped");
    }

    @Override
    public String toString() {
        return "Ec2 Instance";
    }
}
