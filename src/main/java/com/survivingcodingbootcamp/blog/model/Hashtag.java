package com.survivingcodingbootcamp.blog.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String hashtagName;
    @ManyToMany(mappedBy = "hashtags")
    private Collection<Post> posts;

    public Hashtag(String hashtagName) {
        this.hashtagName = hashtagName;
    }

    public Hashtag() {
    }

    public long getId() {
        return id;
    }

    public String getHashtagName() {
        return hashtagName;
    }

    public Collection<Post> getPosts() {
        return posts;
    }
}

