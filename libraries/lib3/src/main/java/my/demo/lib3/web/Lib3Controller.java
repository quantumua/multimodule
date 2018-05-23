package my.demo.lib3.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping(("/lib3"))
public class Lib3Controller {

    @PostConstruct
    public void setup(){
        System.out.println(this.getClass().getCanonicalName() + "is run");
    }

    @GetMapping("/greeting")
    public String greeting(){
        return this.getClass().getCanonicalName() + ": Hello!";
    }
}
