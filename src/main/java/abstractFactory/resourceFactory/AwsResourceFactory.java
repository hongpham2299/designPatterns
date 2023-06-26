package abstractFactory.resourceFactory;

import abstractFactory.product.Ec2Instance;
import abstractFactory.product.Storage;
import abstractFactory.product.Instance;
import abstractFactory.product.S3Storage;

//Factory implementation for AWS platform resources
public class AwsResourceFactory implements ResourceFactory{
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}