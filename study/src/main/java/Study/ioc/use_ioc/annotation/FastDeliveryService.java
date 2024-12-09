package Study.ioc.use_ioc.annotation;


import org.springframework.stereotype.Component;

@Component
public class FastDeliveryService implements DeliveryService {
    @Override
    public String deliver(String item) {
        return "Giao hàng nhanh " + item;

    }
}