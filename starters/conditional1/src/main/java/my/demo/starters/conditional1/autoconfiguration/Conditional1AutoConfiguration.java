package my.demo.starters.conditional1.autoconfiguration;

import my.demo.starters.conditional1.service.Cond1Service;
import my.demo.starters.conditional1.service.impl.Cond1ServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static my.demo.starters.conditional1.autoconfiguration.Conditional1AutoConfiguration.*;

@Configuration
@ConditionalOnProperty(prefix = MY_DEMO_STARTER_MODULE_PREFIX, name = SERVICE_NAME, havingValue = ENABLE_SERVICE)
@EnableConfigurationProperties(Conditional1Properties.class)
public class Conditional1AutoConfiguration {

    public static final String MY_DEMO_STARTER_MODULE_PREFIX = "my.demo.starter.module";
    public static final String SERVICE_NAME = "conditional1";
    public static final String ENABLE_SERVICE = "enable";

    @Bean
    public Cond1Service cond1Service(){
        return new Cond1ServiceImpl();
    }
}
