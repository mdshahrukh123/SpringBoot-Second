package com.test.instagramBasics.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.test.instagramBasics.model.enums.PostType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;
    private String postData;
    private String postCaption;
    @Enumerated(value = EnumType.STRING)
    private PostType postType;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDateTime postCreateDateTime;
    @ManyToOne
    @JoinColumn(name = "fk_user_Id")
    private User user;

}
