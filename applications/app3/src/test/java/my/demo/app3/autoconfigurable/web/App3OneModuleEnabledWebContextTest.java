package my.demo.app3.autoconfigurable.web;

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
@SpringBootTest(properties = {"my.demo.starter.module.conditional2=enable"})
@AutoConfigureMockMvc
public class App3OneModuleEnabledWebContextTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnCond1ServiceName() throws Exception {
        this.mockMvc.perform(get("/cond1/service")).andDo(print()).andExpect(status().isNotFound());
    }

    @Test
    public void shouldReturnCond2ServiceName() throws Exception {
        this.mockMvc.perform(get("/cond2/service")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString( "my.demo.starters.conditional2.service.impl.Cond2ServiceImpl")));
    }
}
