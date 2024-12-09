package Study.ioc.no_ioc;

public class MyApp {
    public static void main(String[] args) {

        DeliveryHistory history = new DeliveryHistory();
        DeliveryLogger deliveryLogger  = new DeliveryLogger();
        DeliveryService fastDeliveryService = new FastDeliveryService(history,deliveryLogger);

        OrderProcessor orderProcessor = new OrderProcessor(fastDeliveryService);
        String laptop = orderProcessor.processOrder("Laptop");
        System.out.println(laptop);

        StandardDeliveryService standardDeliveryService = new StandardDeliveryService();
        OrderProcessor orderProcessor2 = new OrderProcessor(standardDeliveryService);
        String laptop2 = orderProcessor2.processOrder("Laptop2");
        System.out.println(laptop2);
    }
}
