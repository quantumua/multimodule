package my.demo.starters.conditional2.service.impl;


import my.demo.starters.conditional2.service.Cond2Service;

public class Cond2ServiceImpl implements Cond2Service {
    @Override
    public String getServiceName() {
        return this.getClass().getCanonicalName();
    }
}
