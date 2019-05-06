package org.lasencinas.springbootcontroller;

import org.lasencinas.springbootmodel.Topic;
import org.lasencinas.springbootmodel.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService ts;

    @RequestMapping(path = "/topics")
    public List<Topic> getAllTopics(){
        return ts.getAllTopics();
    }

    @RequestMapping(path = "/topics/{id}")
    public Topic getTopic(@PathVariable  String id){
        return ts.getTopic(id);
    }
}
