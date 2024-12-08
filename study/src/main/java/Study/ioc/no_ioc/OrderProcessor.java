package Study.ioc.no_ioc;

public class OrderProcessor {

    private DeliveryService deliveryService;

    public OrderProcessor(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public String processOrder(String item) {
        return "Order processed for: " + item + ". " + deliveryService.deliver(item);
    }
}
