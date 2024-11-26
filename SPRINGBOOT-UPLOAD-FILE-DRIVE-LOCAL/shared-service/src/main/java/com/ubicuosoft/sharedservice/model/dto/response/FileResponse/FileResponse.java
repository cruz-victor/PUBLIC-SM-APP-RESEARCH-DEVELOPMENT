package com.ubicuosoft.sharedservice.model.dto.response.FileResponse;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FileResponse {
    private String filePath;
}
