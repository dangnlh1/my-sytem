package Study.ioc.no_ioc;

public class MyApp {
    public static void main(String[] args) {
        // Tạo đối tượng DeliveryService
        DeliveryService fastDeliveryService = new FastDeliveryService();

        // Inject DeliveryService vào OrderProcessor
        OrderProcessor orderProcessor = new OrderProcessor(fastDeliveryService);

        // Xử lý đơn hàng
        System.out.println(orderProcessor.processOrder("Laptop"));

        // Nếu muốn dùng một dịch vụ khác, bạn phải sửa mã:
        DeliveryService standardDeliveryService = new StandardDeliveryService();
        orderProcessor = new OrderProcessor(standardDeliveryService);
        System.out.println(orderProcessor.processOrder("Smartphone"));
    }
}
