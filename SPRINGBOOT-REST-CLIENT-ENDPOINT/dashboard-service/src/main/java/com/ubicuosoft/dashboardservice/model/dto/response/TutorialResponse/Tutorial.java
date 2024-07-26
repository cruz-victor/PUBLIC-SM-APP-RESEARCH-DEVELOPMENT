package com.ubicuosoft.dashboardservice.model.dto.response.TutorialResponse;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Tutorial {
    private Long id;
    private String module;
    private String url ;
    private LocalDateTime dateUploaded;
    private String title;
    private String description;
    private String state ;
}
