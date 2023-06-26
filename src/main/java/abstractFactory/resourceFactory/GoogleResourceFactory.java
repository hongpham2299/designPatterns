package abstractFactory.resourceFactory;

import abstractFactory.product.Storage;
import abstractFactory.product.GoogleCloudStorage;
import abstractFactory.product.GoogleComputeEngineInstance;
import abstractFactory.product.Instance;

//Factory implementation for Google Cloud platform resources
public class GoogleResourceFactory implements ResourceFactory{
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}