package org.lasencinas.springbootcontroller;

import org.lasencinas.springbootmodel.Topic;
import org.lasencinas.springbootmodel.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody  Topic topic){
        ts.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        ts.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        ts.deleteTopic(id);
    }
}
