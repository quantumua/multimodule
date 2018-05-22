package my.demo.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "my.demo")
public class App1Config {

    public static void main(String[] args) {
        SpringApplication.run(App1Config.class);
    }
}
