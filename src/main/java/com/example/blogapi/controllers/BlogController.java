package com.example.blogapi.controllers;

import com.example.blogapi.models.Blog;
import com.example.blogapi.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController {
    private final BlogService blogService;

    public BlogController(BlogService blogService){
        this.blogService = blogService;
    }

    @GetMapping
    public List<Blog> getAllBlogs(){
        return blogService.getAllBlogs();
    }

    @GetMapping("/{id}")
    public Blog getBlogById(@PathVariable Long id){
        return  blogService.getBlogById(id);
    }

    @PostMapping
    public ResponseEntity<Blog> createBlog(@RequestBody Blog blog){
        blogService.createBlog(blog);
        return ResponseEntity.status(HttpStatus.CREATED).body(blog);
    }

}
