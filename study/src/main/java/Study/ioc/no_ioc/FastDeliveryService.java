package Study.ioc.no_ioc;

public class FastDeliveryService implements DeliveryService {

    private DeliveryHistory deliveryHistory;
    private DeliveryLogger deliveryLogger;

    public FastDeliveryService(DeliveryHistory deliveryHistory, DeliveryLogger deliveryLogger) {
        this.deliveryHistory = deliveryHistory;
        this.deliveryLogger = deliveryLogger;
    }

    @Override
    public String deliver(String item) {
        return "Fast delivery of: " + item + "history" + deliveryHistory.deliverHistory(item);
    }
}
