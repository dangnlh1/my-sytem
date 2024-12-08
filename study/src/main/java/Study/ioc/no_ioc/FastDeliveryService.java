package Study.ioc.no_ioc;

public class FastDeliveryService implements DeliveryService {
    @Override
    public String deliver(String item) {
        return "Fast delivery of: " + item;
    }
}