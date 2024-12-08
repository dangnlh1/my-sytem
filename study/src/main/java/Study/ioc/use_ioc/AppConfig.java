package Study.ioc.use_ioc;

import Study.ioc.no_ioc.DeliveryService;
import Study.ioc.no_ioc.FastDeliveryService;
import Study.ioc.no_ioc.OrderProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DeliveryService fastDeliveryService() {
        return new FastDeliveryService();
    }

    @Bean
    public OrderProcessor orderProcessor() {
        return new OrderProcessor(fastDeliveryService());
    }

    @Bean
    public DeliveryService droneDeliveryService() {
        return new DroneDeliveryService();
    }

}
