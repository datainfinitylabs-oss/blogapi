package com.example.blogapi.services;
import com.example.blogapi.models.Blog;
import java.util.*;

public interface BlogService {
    List<Blog> getAllBlogs();
    Blog getBlogById(Long id);
}
