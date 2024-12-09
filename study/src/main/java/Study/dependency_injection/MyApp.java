package Study.dependency_injection;

import Study.StudyApplication;
import Study.ioc.no_ioc.DeliveryService;
import Study.ioc.no_ioc.FastDeliveryService;
import Study.ioc.no_ioc.OrderProcessor;
import Study.ioc.no_ioc.StandardDeliveryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }
}
