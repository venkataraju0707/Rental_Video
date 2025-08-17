// src/main/java/com/rentvideo/repositories/VideoRepository.java

package com.rentvideo.repositories;

import com.rentvideo.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}