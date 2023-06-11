package com.example.blogapi.services;

import com.example.blogapi.models.Blog;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class BlogServiceImpl implements BlogService {
    private List<Blog> blogs;

    //    constructor
    public BlogServiceImpl(){
        blogs = new ArrayList<>();
        blogs.add(new Blog(1L, "First Blog", "This is the content of the first blog."));
        blogs.add(new Blog(2L, "Second Blog", "This is the content of the second blog."));
    }

    @Override
    public List<Blog> getAllBlogs() {
        return blogs;
    }

    @Override
    public Blog getBlogById(Long id) {
        return blogs.stream().filter(blog->blog.getId().equals(id)).findFirst().orElse(null);
    }
}
