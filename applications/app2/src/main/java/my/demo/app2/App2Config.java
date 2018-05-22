package my.demo.app2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "my.demo")
public class App2Config {

    public static void main(String[] args) {
        SpringApplication.run(App2Config.class);
    }
}
