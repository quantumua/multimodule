package my.demo.starters.conditional1.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import static my.demo.starters.conditional1.autoconfiguration.Conditional1AutoConfiguration.MY_DEMO_STARTER_MODULE_PREFIX;

@ConfigurationProperties(MY_DEMO_STARTER_MODULE_PREFIX )
public class Conditional1Properties {


    private String conditional1;

    public String getConditional1() {
        return conditional1;
    }

    public void setConditional1(String conditional1) {
        this.conditional1 = conditional1;
    }
}
