package org.lasencinas.springbootmodel;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

   List<Topic> listTopic = Arrays.asList(new Topic("spring", "Spring Freamwork", "Spring Freamwork Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "Javascript", "Javascript Description"));


    public List<Topic> getAllTopics() {
        return listTopic;
    }
}
