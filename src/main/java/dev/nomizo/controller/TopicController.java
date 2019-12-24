package dev.nomizo.controller;

import dev.nomizo.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// Annotation used to make amy class a REST Controller.  Which allows us to send and receive JSON as our form of data.
@RestController
public class TopicController {

    // Annotation used on methods for a request to work.  Also passes in a string that represents the URL (GET BY DEFAULT)
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
     return Arrays.asList(
             new Topic("Image", "Spawn", "When is the movie coming out"),
             new Topic("Marvel", "Infinity War", "Thanos"),
             new Topic("DC", "Dark Knight", "The Joker is coming")
     );
    }
}
