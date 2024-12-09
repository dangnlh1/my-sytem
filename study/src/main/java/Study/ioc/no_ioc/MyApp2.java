package Study.ioc.no_ioc;

public class MyApp2 {
    public static void main(String[] args) {

        ReceiveService receiveService = new ReceiveService() ;

        DeliveryService fastDeliveryService = new FastDeliveryService();

        FeedbackService feedbackService = new FeedbackService();

        OrderProcessor orderProcessor = new OrderProcessor(fastDeliveryService, receiveService, feedbackService);

        System.out.println(orderProcessor.processOrder("Smartphone"));
    }
}
