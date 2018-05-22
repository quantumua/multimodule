package my.demo.app2.autoconfigurable;

import my.libs.hello.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App2Autoconfigurable {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(App2Autoconfigurable.class);
        ctx.getBean(HelloService.class).sayHello();
    }
}
