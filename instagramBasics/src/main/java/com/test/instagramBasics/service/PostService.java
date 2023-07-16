package com.test.instagramBasics.service;

import com.test.instagramBasics.model.Post;
import com.test.instagramBasics.repository.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    IPostRepo postRepo;

    public String createPost(Post post) {
        post.setPostCreateDateTime(LocalDateTime.now());
        postRepo.save(post);
        return "Post Uploaded Successfully...!!!!!";
    }

    public Optional<Post> getPostById(Integer postId) {
        return postRepo.findById(postId);
    }
}
