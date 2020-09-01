package com.serafeim.agia.zoni.agiazoni.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.serafeim.agia.zoni.agiazoni.model.Article;
import com.serafeim.agia.zoni.agiazoni.model.Media;
import com.serafeim.agia.zoni.agiazoni.model.Post;
import com.serafeim.agia.zoni.agiazoni.model.Source;
import com.serafeim.agia.zoni.agiazoni.service.ReadJSONService;
import com.serafeim.agia.zoni.agiazoni.service.RestClientService;
import com.serafeim.agia.zoni.agiazoni.service.RetreiveWordpressInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class AgiaZoniController {

    @Autowired
    public ReadJSONService readJSONService;
    @Autowired
    public RetreiveWordpressInfoService retreiveWordpressInfoService;
    @Autowired
    public RestClientService restClientService;


    @GetMapping("/createTaxonomyJsonFiles")
    public String createTaxonomyJsonFiles() {
        readJSONService.createTaxonomyJsonFiles();
        return "createTaxonomyJsonFiles called";
    }

    @GetMapping("/createArticlesJsonFile")
    public String createArticlesJsonFile() {
        readJSONService.createArticlesJsonFile();
        return "createArticlesJsonFile called";
    }

    @GetMapping("/getAllPosts")
    public String getAllPosts(@RequestParam String type) {
        List<Post> posts = retreiveWordpressInfoService.getAllPosts(type);
        readJSONService.createJsonFile(posts, "wordpress_" + type + ".json");
        return "getAllPosts called " + posts.size();
    }

    @GetMapping("/getAllMedia")
    public String getAllMedia() {
        List<Media> mediaList = retreiveWordpressInfoService.getAllMedia();
        readJSONService.createJsonFile(mediaList, "wordpress_media.json");
        return "getAllMedia called " + mediaList.size();
    }

    @GetMapping("/createSourcesEpikaitotita")
    public String createSourcesEpikaitotita() {
        Set<Source> sources = readJSONService.createSourcesEpikaitotita();
        return "createSourcesEpikaitotita called " + sources.size();
    }

    @GetMapping("/createEpikaitotitaPosts")
    public String createEpikaitotitaPosts() {
        List<Article> posts = readJSONService.createEpikaitotitaPosts();
        return "createEpikaitotitaPosts called " + posts.size();
    }

    @GetMapping("/createParemvaseisPosts")
    public String createParemvaseisPosts() {
        List<Article> posts = readJSONService.createParemvaseisPosts();
        return "createParemvaseisPosts called " + posts.size();
    }
    @GetMapping("/createArticlesFromJsonFile")
    public String createArticlesFromJsonFile(@RequestParam String filename) throws JsonProcessingException {
        List<Article> articles = restClientService.createArticlesFromJsonFile(filename);
        restClientService.createArticles(articles);
        return "createArticlesFromJsonFile called " + articles.size();
    }


}