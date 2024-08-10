package me.wonsuk.jwt_tutorial.service;

import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import static org.springframework.http.RequestEntity.post;

@Service
public class HelloService {
    public void call(String id) {
        RestClient restClient = RestClient.create();
         restClient.post()
                .uri("")
                 .header("test","10")
                .contentType(MediaType.APPLICATION_JSON)
                 //.body(DTO)
                 .retrieve()
                 .body(String.class);
    }
}
