package my.demo.lib2.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ServiceLib2 implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.getClass().getCanonicalName() + " service run");
    }
}
