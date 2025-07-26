package com.medianest.api.config;

import com.medianest.api.model.Wallpapers;
import com.medianest.api.repository.WallpaperRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner initData(WallpaperRepo wallpaperRepo){
        return  args -> {
            if(wallpaperRepo.count()==0){
                List<Wallpapers> wallpapers = List.of(
                        Wallpapers.builder()
                                .title("Sunset Bliss")
                                .imageUrl("https://drive.google.xyz1")
                                .category("Nature")
                                .authorName("Sriyansh Srivastava")
                                .createdAt(LocalDateTime.now())
                                .build(),
                        Wallpapers.builder()
                                .title("Cyberpunk City")
                                .imageUrl("https://drive.google.xyz2")
                                .category("Sci-Fi")
                                .authorName("Sriyansh Srivastava")
                                .createdAt(LocalDateTime.now())
                                .build(),
                        Wallpapers.builder()
                                .title("Mountain Chill")
                                .imageUrl("https://drive.google.xyz3")
                                .category("Nature")
                                .authorName("Ritesh")
                                .createdAt(LocalDateTime.now())
                                .build(),
                        Wallpapers.builder()
                                .title("Mountain Home")
                                .imageUrl("https://drive.google.xyz4")
                                .category("Architecture")
                                .authorName("Maruti Nandan")
                                .createdAt(LocalDateTime.now())
                                .build()
                );
                wallpaperRepo.saveAll(wallpapers);
                System.out.println("Dummy Data inserted.");
            }else {
                System.out.println("Dummy Data already exists.");
            }

        };
    }
}
