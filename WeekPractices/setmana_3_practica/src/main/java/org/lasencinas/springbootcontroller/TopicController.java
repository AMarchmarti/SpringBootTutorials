package org.lasencinas.springbootcontroller;

import org.lasencinas.springbootmodel.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping(path = "/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(new Topic("spring", "Spring Freamwork", "Spring Freamwork Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "Javascript", "Javascript Description"));
    }
}
