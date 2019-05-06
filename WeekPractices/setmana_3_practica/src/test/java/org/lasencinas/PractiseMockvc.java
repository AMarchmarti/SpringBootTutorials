package org.lasencinas;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lasencinas.springbootmodel.Topic;
import org.lasencinas.springbootmodel.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
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

    @Test
    public void test_getTopic() throws Exception {
        mockMvc.perform(get("/topics/java").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
    }

    @Test
    public void test_getTopicJson() throws Exception {
        mockMvc.perform(get("/topics/java").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{id : 'java', name: 'Core Java', description : 'Core Java Description'}"));
    }

    @Test
    public void test_deleteTopic() throws Exception {
        mockMvc.perform(delete("/topics/java").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }
}
