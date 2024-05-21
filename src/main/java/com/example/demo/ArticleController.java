package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArticleController {
    private final ArticleService service;

    @Autowired
    public ArticleController(ArticleService service) {
        this.service = service;
    }

    @GetMapping("/articles")
    public List<Article> getAllArticles() {
        return service.findAll();
    }

    @GetMapping("/articles/{id}")
    public Article getArticleById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping("/articles")
    public void createArticle(@RequestBody Article article) {
        service.save(article);
    }

    @PutMapping("/articles/{id}")
    public void updateArticle(@PathVariable String id, @RequestBody Article article) {
        article.setId(id);
        service.update(article);
    }

    @DeleteMapping("/articles/{id}")
    public void deleteArticle(@PathVariable String id) {
        service.deleteById(id);
    }
}
