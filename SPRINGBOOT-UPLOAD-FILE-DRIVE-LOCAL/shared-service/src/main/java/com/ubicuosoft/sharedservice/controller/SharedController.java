package com.ubicuosoft.sharedservice.controller;

import com.ubicuosoft.sharedservice.model.dto.response.FileResponse.FileResponse;
import com.ubicuosoft.sharedservice.model.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequiredArgsConstructor
@RestController
@RequestMapping("/shared/api/v2")
public class SharedController {
    private final UploadFileService uploadFileService;
    private final RetriveFileService retriveFileService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/file")
    public void uploadFile(@RequestParam("file") MultipartFile file, @RequestParam String targetDirectory) {
        System.out.println("SharedController.uploadFile--->");
        uploadFileService.execute(file, targetDirectory);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/file")
    public FileResponse getFileFromPath(@RequestParam("sourceDirectory") String sourceDirectory, @RequestParam("fileNameWithExtension") String fileNameWithExtension) {
        return retriveFileService.execute(sourceDirectory, fileNameWithExtension);
    }
}
