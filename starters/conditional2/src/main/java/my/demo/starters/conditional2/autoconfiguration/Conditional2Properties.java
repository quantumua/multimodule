package my.demo.starters.conditional2.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

import static my.demo.starters.conditional2.autoconfiguration.Conditional2AutoConfiguration.MY_DEMO_STARTER_SERVICE_PREFIX;


@ConfigurationProperties(prefix = MY_DEMO_STARTER_SERVICE_PREFIX)
@Validated
public class Conditional2Properties {

    private String enable;
    @NotNull
    private String environment;

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
