package com.medianest.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "wallpapers")
public class Wallpapers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false,length = 100)
    private String title;
    private String description;
    @Column(nullable = false,length = 50)
    private String category;
    @Column(name = "image_url",nullable = false,columnDefinition = "TEXT")
    private String imageUrl;
    @Column(name = "created_at",nullable = false)
    private LocalDateTime createdAt;
    @Column(name = "author_name")
    private String authorName;
}
