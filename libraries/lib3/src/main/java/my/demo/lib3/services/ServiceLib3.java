package my.demo.lib3.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ServiceLib3 implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.getClass().getCanonicalName() + " service run");
    }
}
