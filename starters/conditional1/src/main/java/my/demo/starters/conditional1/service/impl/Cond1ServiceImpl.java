package my.demo.starters.conditional1.service.impl;

import my.demo.starters.conditional1.service.Cond1Service;

public class Cond1ServiceImpl implements Cond1Service {
    @Override
    public String getServiceName() {
        return this.getClass().getCanonicalName();
    }
}
