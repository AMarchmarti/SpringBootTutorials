package org.lasencinas;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lasencinas.springbootmodel.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PractiseMockvc {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test_sayHi() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hi!"));
    }

    @Test
    public void test_getAllTopics() throws Exception {
        mockMvc.perform(get("/topics"))
                .andExpect(status().isOk());

    }
}
