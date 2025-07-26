package com.medianest.api.controller;

import com.medianest.api.model.Wallpapers;
import com.medianest.api.service.WallpaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/wallpapers")
public class WallpaperController {
    private final WallpaperService wallpaperService;

    // this is constructor
    @Autowired
    public  WallpaperController(WallpaperService wallpaperService){
        this.wallpaperService=wallpaperService;
    }

    @GetMapping("/")
    public List<Wallpapers> getAllWallpapers(){
        return wallpaperService.getAllWallpapers();
    }

    @GetMapping("/{wallId}")
    public ResponseEntity<Wallpapers> wallpaper(@PathVariable Long wallId){
        Wallpapers wallpaper = wallpaperService.getWallpaperById(wallId);
        if (wallpaper!=null){
            return ResponseEntity.ok(wallpaper);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
