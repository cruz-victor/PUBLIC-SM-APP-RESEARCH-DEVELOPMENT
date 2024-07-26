package com.ubicuosoft.dashboardservice.model.dto.response.TutorialResponse;

import lombok.Data;

import java.util.List;

@Data
public class TutorialResponse {
    private List<Tutorial> tutorials;
}