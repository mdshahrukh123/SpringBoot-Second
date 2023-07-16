package com.test.instagramBasics.controller;

import com.test.instagramBasics.model.Post;
import com.test.instagramBasics.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping("post")
    public String postUpload(@RequestBody Post post){
        return postService.createPost(post);
    }

    @GetMapping("post/id/{postId}")
    public Optional<Post> getAllPostById(@PathVariable Integer postId){
        return postService.getPostById(postId);
    }
}
