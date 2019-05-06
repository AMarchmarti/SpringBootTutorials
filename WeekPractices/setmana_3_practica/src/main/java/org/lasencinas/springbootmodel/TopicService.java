package org.lasencinas.springbootmodel;


import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

   List<Topic> listTopic = new ArrayList<>(Arrays.asList(new Topic("spring", "Spring Freamwork", "Spring Freamwork Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "Javascript", "Javascript Description")));


    public List<Topic> getAllTopics() {
        return listTopic;
    }

    public Topic getTopic(String id){
        return listTopic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }


    public void addTopic(Topic topic){
        listTopic.add(topic);
    }


    public void updateTopic(String id, Topic topic){
        for(int i = 0; i < listTopic.size(); i++){
            Topic t = listTopic.get(i);
            if(t.getId().equals(id)){
                listTopic.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id){
        listTopic.removeIf(topic -> topic.getId().equals(id));
    }
}
