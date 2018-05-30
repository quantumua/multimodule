package my.demo.starters.conditional2.autoconfiguration;

import my.demo.starters.conditional2.autoconfiguration.web.Conditional2WebConfiguration;
import my.demo.starters.conditional2.service.Cond2Service;
import my.demo.starters.conditional2.service.impl.Cond2ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import static my.demo.starters.conditional2.autoconfiguration.Conditional2AutoConfiguration.IS_ENABLED;

@Configuration
@ConditionalOnProperty(prefix = Conditional2AutoConfiguration.MY_DEMO_STARTER_SERVICE_PREFIX, name = IS_ENABLED, havingValue = "true")
@PropertySource("classpath:conditional2-${spring.profiles.active}.properties")
@EnableConfigurationProperties(Conditional2Properties.class)
public class Conditional2AutoConfiguration {

    public static final String MY_DEMO_STARTER_SERVICE_PREFIX = "my.demo.starter.module.conditional2";
    public static final String IS_ENABLED = "enable";

    @Autowired
    private Conditional2Properties conditional2Properties;

    @Bean
    public Cond2Service cond2Service(){
        return new Cond2ServiceImpl(conditional2Properties);
    }

    @Bean
    public Conditional2WebConfiguration webConfiguration(Cond2Service cond2Service){
        return new Conditional2WebConfiguration(cond2Service);
    }
}
