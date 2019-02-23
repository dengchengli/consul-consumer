package consumer.demo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
   private ProducerService producerService;

    @GetMapping("/consumer")
    public String hello() throws Exception{
      // return producerService.say();
        return producerService.say("1111",new User("2222","dely"));
    }
}
