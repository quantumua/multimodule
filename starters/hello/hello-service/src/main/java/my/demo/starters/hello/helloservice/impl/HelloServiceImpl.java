package my.demo.starters.hello.helloservice.impl;

import my.demo.starters.hello.helloservice.HelloService;

public class HelloServiceImpl implements HelloService {

    private HelloConfiguration helloConfiguration;

    public HelloServiceImpl(HelloConfiguration helloConfiguration) {
        this.helloConfiguration = helloConfiguration;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello " + helloConfiguration.getName());
    }
}
