package my.demo.app3.autoconfigurable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
//set system variables to enable all modules
@SpringBootTest(properties = {"my.demo.starter.module.conditional1=enable"})
public class App3OneModuleEnabledContextTest {

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void cond1ServiceLoaded() {
        assertThat(ctx.getBean("cond1Service"), is(notNullValue()));
    }

    @Test(expected = NoSuchBeanDefinitionException.class)
    public void cond2ServiceNotLoaded() {
        ctx.getBean("cond2Service");
    }
}
