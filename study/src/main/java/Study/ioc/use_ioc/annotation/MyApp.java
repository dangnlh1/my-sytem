package Study.ioc.use_ioc.annotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
