package com.ubicuosoft.sharedservice.model.service;

import com.ubicuosoft.sharedservice.model.common.exception.SpecificExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static com.ubicuosoft.sharedservice.model.common.constant.ServerConfiguration.UPLOAD_SERVER;

@Service
public class UploadFileService {
//        1.	validateUploadFileRequest
//        2.	uploadFile

    //MultipartFile file; En postman desde el Body opcion form-data con nombre file
    //String targetDirectory; por ejemplo: x_upload
    public void execute(MultipartFile file, String targetDirectory) {
        validateUploadFileRequest(file, targetDirectory);
        uploadFile(file, targetDirectory);
    }

    private void validateUploadFileRequest(MultipartFile file, String targetDirectory) {
    }

    private void uploadFile(MultipartFile file, String pathTargetDirectory) {
        try {
            pathTargetDirectory = UPLOAD_SERVER + File.separator + pathTargetDirectory;
            File targetDirectory = new File(pathTargetDirectory);

            if (!targetDirectory.exists()) {
                targetDirectory.mkdirs();
            }

            String filePath = targetDirectory.getPath() + File.separator + file.getOriginalFilename();
            file.transferTo(Path.of(filePath));
        } catch (IOException e) {
            throw new SpecificExceptionHandler(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }
}
