package Study.ioc.no_ioc;

public class StandardDeliveryService implements DeliveryService {
    @Override
    public String deliver(String item) {
        return "Standard delivery of: " + item;
    }
}
