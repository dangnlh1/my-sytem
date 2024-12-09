package Study.ioc.use_ioc.java_configuration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@Configuration
//@ComponentScan(basePackages = "Study.ioc.use_ioc.annotation")
@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApp.class);

        // Lấy bean từ container
        OrderProcessor orderProcessor = context.getBean(OrderProcessor.class);
        System.out.println(orderProcessor.processOrder("Smartphone"));

        context.close();
    }
}
