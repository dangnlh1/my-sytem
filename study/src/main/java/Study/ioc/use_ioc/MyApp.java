package Study.ioc.use_ioc;

import Study.ioc.no_ioc.OrderProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyApp {

    public static void main(String[] args) {
        // Tải Spring Container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Lấy OrderProcessor từ container
        OrderProcessor orderProcessor = context.getBean("orderProcessor", OrderProcessor.class);

        // Xử lý đơn hàng
        System.out.println(orderProcessor.processOrder("Laptop"));

        // Đóng container
        context.close();
    }

}
