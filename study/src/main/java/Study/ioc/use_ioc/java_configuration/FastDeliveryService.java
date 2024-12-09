package Study.ioc.use_ioc.java_configuration;


import org.springframework.stereotype.Component;


public class FastDeliveryService implements DeliveryService {
    @Override
    public String deliver(String item) {
        return "Giao hàng nhanh " + item;

    }
}