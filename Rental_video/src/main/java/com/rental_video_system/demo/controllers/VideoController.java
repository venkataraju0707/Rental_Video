// src/main/java/com/rentvideo/controllers/VideoController.java

package com.rentvideo.controllers;

import com.rentvideo.dtos.VideoDto;
import com.rentvideo.entities.Video;
import com.rentvideo.repositories.VideoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videos")
public class VideoController {

    private final VideoRepository videoRepository;

    public VideoController(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    // PUBLIC: Get all videos
    @GetMapping
    public ResponseEntity<List<Video>> getAllVideos() {
        return ResponseEntity.ok(videoRepository.findAll());
    }

    // ADMIN: Create a new video
    @PostMapping
    public ResponseEntity<Video> createVideo(@RequestBody VideoDto videoDto) {
        Video video = new Video();
        video.setTitle(videoDto.getTitle());
        video.setDirector(videoDto.getDirector());
        video.setGenre(videoDto.getGenre());
        video.setAvailable(true); // All new videos are available

        Video savedVideo = videoRepository.save(video);
        return new ResponseEntity<>(savedVideo, HttpStatus.CREATED);
    }

    // ADMIN: Update a video
    @PutMapping("/{id}")
    public ResponseEntity<Video> updateVideo(@PathVariable Long id, @RequestBody VideoDto videoDto) {
        return videoRepository.findById(id)
                .map(existingVideo -> {
                    existingVideo.setTitle(videoDto.getTitle());
                    existingVideo.setDirector(videoDto.getDirector());
                    existingVideo.setGenre(videoDto.getGenre());
                    existingVideo.setAvailable(videoDto.isAvailable());
                    return ResponseEntity.ok(videoRepository.save(existingVideo));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // ADMIN: Delete a video
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVideo(@PathVariable Long id) {
        videoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}