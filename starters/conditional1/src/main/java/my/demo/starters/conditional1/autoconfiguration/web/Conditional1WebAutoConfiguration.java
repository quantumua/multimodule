package my.demo.starters.conditional1.autoconfiguration.web;

import my.demo.starters.conditional1.service.Cond1Service;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

import static my.demo.starters.conditional1.autoconfiguration.Conditional1AutoConfiguration.*;

@ConditionalOnProperty(prefix = MY_DEMO_STARTER_MODULE_PREFIX, name = SERVICE_NAME, havingValue = ENABLE_SERVICE)
@RestController
@RequestMapping("/cond1")
public class Conditional1WebAutoConfiguration {

   private Cond1Service service;

    public Conditional1WebAutoConfiguration(Cond1Service service) {
        this.service = service;
    }

    @PostConstruct
    public void setup(){
        System.out.println(this.getClass().getCanonicalName() + " is run");
    }

    @GetMapping("/service")
    public String getName(){
        return service.getServiceName();
    }

}
