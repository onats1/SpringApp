package com.example.springApp.SpringApp.Topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("01", "First Topic", "This is the first topic of the app"),
            new Topic("02", "Second Topic", "This is the Second topic of the app"),
            new Topic("03", "Third Topic", "This is the Third topic of the app")
    ));

    List<Topic> getTopics() {
        return topics;
    }

    Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    void addTopic(Topic topic){
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for(int i = 0; i<topics.size(); i++) {

            if (topics.get(i).getId().equals(id)){
                topics.set(i, topic);
                return;
            }

        }
    }

    public void deleteTopic(String id) {
        for(Topic nTopic: topics){
            if(nTopic.getId().equals(id)){
                topics.remove(nTopic);
            }
        }
    }
}




