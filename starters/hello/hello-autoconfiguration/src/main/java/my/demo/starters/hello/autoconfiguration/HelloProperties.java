package my.demo.starters.hello.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my.demo.hello")
public class HelloProperties {
    public String name = "unknown";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
