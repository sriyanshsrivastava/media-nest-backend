package com.medianest.api.service;

import com.medianest.api.model.Wallpapers;
import com.medianest.api.repository.WallpaperRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WallpaperService {
    private final WallpaperRepo wallpaperRepo;

    @Autowired
    public WallpaperService(WallpaperRepo wallpaperRepo){
        this.wallpaperRepo=wallpaperRepo;
    }

    public List<Wallpapers> getAllWallpapers(){
        return wallpaperRepo.findAll();
    }
}
