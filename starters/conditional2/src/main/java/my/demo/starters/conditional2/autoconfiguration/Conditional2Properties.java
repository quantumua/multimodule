package my.demo.starters.conditional2.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import static my.demo.starters.conditional2.autoconfiguration.Conditional2AutoConfiguration.MY_DEMO_STARTER_MODULE_PREFIX;


@ConfigurationProperties(prefix = MY_DEMO_STARTER_MODULE_PREFIX)
public class Conditional2Properties {


    private String conditional2;

    public String getConditional1() {
        return conditional2;
    }

    public void setConditional1(String conditional2) {
        this.conditional2 = conditional2;
    }
}
