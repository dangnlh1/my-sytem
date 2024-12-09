package Study.ioc.use_ioc.annotation;

import org.springframework.stereotype.Component;

@Component
public class ReceiveService {
    public String receive (String item) {
        return "Khách hàng nhận hàng :  " + item;
    }
}
