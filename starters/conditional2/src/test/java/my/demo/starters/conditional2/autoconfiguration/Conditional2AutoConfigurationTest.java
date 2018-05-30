package my.demo.starters.conditional2.autoconfiguration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Conditional2AutoConfiguration.class, properties = {"my.demo.starter.module.conditional2.enable=true"})
@ActiveProfiles("dev")
@AutoConfigureMockMvc
public class Conditional2AutoConfigurationTest {


    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private Environment env;

    @Test
    public void shouldReturnCond1ServiceName() throws Exception {
        this.mockMvc.perform(get("/cond2/service")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString( "my.demo.starters.conditional2.service.impl.Cond2ServiceImpl")));
    }

    @Test
    public void shouldReturnCond2ServiceName() throws Exception {
        this.mockMvc.perform(get("/cond2/environment")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString( "my.demo.starters.conditional2.service.impl.Cond2ServiceImpl run in development")));
    }

}