package abstractFactory.resourceFactory;

import abstractFactory.product.Storage;
import abstractFactory.product.Instance;

//Abstract factory with methods defined for each object type
public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage (int capMib);
}
