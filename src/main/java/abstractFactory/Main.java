package abstractFactory;

import abstractFactory.product.Instance;
import abstractFactory.resourceFactory.AwsResourceFactory;

public class Main {

    public static void main(String[] args) {

        Client awsClient = new Client(new AwsResourceFactory());
        Instance awsInstance = awsClient.createServer(Instance.Capacity.MICRO, 20480);
        awsInstance.start();
        awsInstance.stop();
    }
}
