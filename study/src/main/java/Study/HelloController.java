package Study;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/workout")
    public String workout() {
        return "Hello workout";
    }

    @GetMapping("/workout-test")
    public String workoutTest() {
        return "Hello workout test";
    }
}
