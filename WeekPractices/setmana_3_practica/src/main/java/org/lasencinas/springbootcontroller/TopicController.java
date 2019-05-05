package org.lasencinas.springbootcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @RequestMapping(path = "/topics")
    public String getAllTopics(){
        return "All Topics";
    }
}
