package my.demo.app1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class App1ContextTest {

//    @Autowired
//    private ServiceLib1 serviceLib1;
//
//    @Autowired
//    private ServiceLib2 serviceLib2;
//
//    @Autowired
//    private ServiceLib3 serviceLib3;

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void serviceLib1Loaded(){
//        assertThat(serviceLib1, is(notNullValue()));
        assertThat(ctx.getBean("serviceLib1"), is(notNullValue()));
    }

    @Test
    public void serviceLib2Loaded(){
//        assertThat(serviceLib2, is(notNullValue()));
        assertThat(ctx.getBean("serviceLib2"), is(notNullValue()));
    }

    @Test
    public void serviceLib3Loaded(){
//        assertThat(serviceLib3, is(notNullValue()));
        assertThat(ctx.getBean("serviceLib3"), is(notNullValue()));
    }

}
