package my.demo.starters.conditional2.autoconfiguration;

import my.demo.starters.conditional2.autoconfiguration.web.Conditional2WebConfiguration;
import my.demo.starters.conditional2.service.Cond2Service;
import my.demo.starters.conditional2.service.impl.Cond2ServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = Conditional2AutoConfiguration.MY_DEMO_STARTER_MODULE_PREFIX, name = Conditional2AutoConfiguration.SERVICE_NAME, havingValue = Conditional2AutoConfiguration.ENABLE_SERVICE_VALUE)
@EnableConfigurationProperties(Conditional2Properties.class)
public class Conditional2AutoConfiguration {

    public static final String MY_DEMO_STARTER_MODULE_PREFIX = "my.demo.starter.module";
    public static final String SERVICE_NAME = "conditional2";
    public static final String ENABLE_SERVICE_VALUE = "enable";

    @Bean
    public Cond2Service cond2Service(){
        return new Cond2ServiceImpl();
    }

    @Bean
    public Conditional2WebConfiguration webConfiguration(Cond2Service cond2Service){
        return new Conditional2WebConfiguration(cond2Service);
    }
}
