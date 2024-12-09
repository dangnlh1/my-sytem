package Study.ioc.use_ioc;

import Study.ioc.no_ioc.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DeliveryHistory deliveryHistory() {
        return new DeliveryHistory();
    }

    @Bean
    public DeliveryLogger deliveryLogger() {
        return new DeliveryLogger();
    }

    @Bean
    public OrderProcessor orderProcessor() {
        return new OrderProcessor(fastDeliveryService());
    }

    @Bean
    public DeliveryService fastDeliveryService() {
        return new FastDeliveryService(deliveryHistory(),deliveryLogger());
    }

    @Bean
    public DeliveryService droneDeliveryService() {
        return new DroneDeliveryService();
    }

}
