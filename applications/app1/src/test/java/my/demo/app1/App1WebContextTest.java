package my.demo.app1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class App1WebContextTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnLib1ControllerGreetingMessage() throws Exception {
        this.mockMvc.perform(get("/lib1/greeting")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString( "my.demo.lib1.web.Lib1Controller: Hello!")));
    }

    @Test
    public void shouldReturnLib3ControllerGreetingMessage() throws Exception {
        this.mockMvc.perform(get("/lib3/greeting")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString( "my.demo.lib3.web.Lib3Controller: Hello!")));
    }

/*    private String getGreetingMessage(Class clazz){
        return clazz.getCanonicalName() + ": Hello!";
    }*/

}