package Study.ioc.no_ioc;

import org.springframework.stereotype.Component;

@Component
public interface DeliveryService {
    String deliver(String item);
}