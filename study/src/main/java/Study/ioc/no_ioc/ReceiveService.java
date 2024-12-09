package Study.ioc.no_ioc;

import org.springframework.stereotype.Component;


public class ReceiveService {
    public String receive (String item) {
        return "Khách hàng nhận hàng :  " + item;
    }
}
