package com.medianest.api.repository;

import com.medianest.api.model.Wallpapers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WallpaperRepo extends JpaRepository<Wallpapers,Long> {
}
