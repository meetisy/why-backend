package com.example.whybackend.controller;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import com.example.whybackend.Idea;
import com.example.whybackend.Question;
import com.example.whybackend.elasticsearchclient.ElasticSearchConfig;
import com.example.whybackend.service.impl.IdeaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchQuestionController {
    @Autowired
    private IdeaImpl ideaService;
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:8080",allowCredentials = "true")
    @RequestMapping(value = "get_search_question_list", method = RequestMethod.GET)
    public Object getSearchQuestionList(@RequestParam("SearchInput") String SearchInput) throws IOException {
        ElasticSearchConfig cfg = new ElasticSearchConfig();
        ElasticsearchClient client = cfg.getClient();
        SearchResponse<Question> search = client.search(s -> s
                        .index("question")
                        .query(q -> q
                                .match(t -> t
                                        .field("Title")
                                        .query(SearchInput)
                                )
                        ),
                Question.class);
        ArrayList<Question> ar = new ArrayList<>();
        for (Hit<Question> hit: search.hits().hits()) {
            ar.add(hit.source());
        }
        return ar;
    }
}
