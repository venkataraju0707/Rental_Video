// src/main/java/com/rentvideo/dtos/VideoDto.java

package com.rentvideo.dtos;

import lombok.Data;

@Data
public class VideoDto {
    private String title;
    private String director;
    private String genre;
    private boolean isAvailable;
}