package Study.ioc.use_ioc.annotation;


import org.springframework.stereotype.Component;

@Component
public class OrderProcessor {

    private final DeliveryService deliveryService;

    private final ReceiveService receiveService;

    private final FeedbackService feedbackService;

    public OrderProcessor(DeliveryService deliveryService, ReceiveService receiveService, FeedbackService feedbackService) {
        this.deliveryService = deliveryService;
        this.receiveService = receiveService;
        this.feedbackService = feedbackService;
    }

    public String processOrder(String item) {
        return "Khách hàng đã đặt đơn hàng: " + item + "\n" + deliveryService.deliver(item) + "\n" + receiveService.receive(item) + "\n" + feedbackService.receive(item);
    }
}
