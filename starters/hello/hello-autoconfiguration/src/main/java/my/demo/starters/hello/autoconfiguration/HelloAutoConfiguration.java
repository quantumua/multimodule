package my.demo.starters.hello.autoconfiguration;


import my.demo.starters.hello.helloservice.HelloService;
import my.demo.starters.hello.helloservice.impl.HelloConfiguration;
import my.demo.starters.hello.helloservice.impl.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HelloService.class)
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

    @Autowired
    public HelloProperties helloProperties;

    @Bean
    @ConditionalOnMissingBean
    public HelloConfiguration helloConfiguration() {
        HelloConfiguration helloConfiguration = new HelloConfiguration();
        helloConfiguration.setName(helloProperties.name);
        return helloConfiguration;
    }

    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService(HelloConfiguration helloConfiguration) {
        return new HelloServiceImpl(helloConfiguration);
    }
}

