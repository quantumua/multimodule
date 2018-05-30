package my.demo.starters.conditional2.autoconfiguration.web;

import my.demo.starters.conditional2.service.Cond2Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/cond2")
public class Conditional2WebConfiguration {

   private Cond2Service service;

    public Conditional2WebConfiguration(Cond2Service service) {
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

    @GetMapping("/environment")
    public String getEnvironment(){
        return service.getEnvironment();
    }



}
