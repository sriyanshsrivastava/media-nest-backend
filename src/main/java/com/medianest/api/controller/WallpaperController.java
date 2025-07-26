package com.medianest.api.controller;

import com.medianest.api.model.Wallpapers;
import com.medianest.api.service.WallpaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WallpaperController {
    private final WallpaperService wallpaperService;

    // this is constructor
    @Autowired
    public  WallpaperController(WallpaperService wallpaperService){
        this.wallpaperService=wallpaperService;
    }

    @GetMapping("/api/wallpapers")
    public List<Wallpapers> getAllWallpapers(){
        return wallpaperService.getAllWallpapers();
    }
}
