package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.List;


public interface ArticleRepository {
    List<Article> findAll();
    Article findById(String id);
    void save(Article article);
    void update(Article article);
    void deleteById(String id);
}
