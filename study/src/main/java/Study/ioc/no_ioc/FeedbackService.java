package Study.ioc.no_ioc;

import org.springframework.stereotype.Component;


public class FeedbackService {
    public String receive (String item) {
        return "Khách đánh giá 5 sao :  " + item;
    }
}
