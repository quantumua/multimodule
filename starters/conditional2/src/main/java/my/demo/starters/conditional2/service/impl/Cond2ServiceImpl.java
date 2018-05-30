package my.demo.starters.conditional2.service.impl;


import my.demo.starters.conditional2.autoconfiguration.Conditional2Properties;
import my.demo.starters.conditional2.service.Cond2Service;

public class Cond2ServiceImpl implements Cond2Service {

    private Conditional2Properties conditional2Properties;

    public Cond2ServiceImpl(Conditional2Properties conditional2Properties) {
        this.conditional2Properties = conditional2Properties;
    }

    @Override
    public String getServiceName() {
        return this.getClass().getCanonicalName();
    }

    @Override
    public String getEnvironment() {
        return getServiceName() + " run in " + conditional2Properties.getEnvironment();
    }
}
