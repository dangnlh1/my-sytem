package Study.ioc.no_ioc;

public class FastDeliveryService implements DeliveryService {
    @Override
    public String deliver(String item) {
        return "Giao hàng nhanh " + item;

    }
}