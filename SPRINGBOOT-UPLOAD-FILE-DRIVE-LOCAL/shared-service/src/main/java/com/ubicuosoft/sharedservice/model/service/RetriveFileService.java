package com.ubicuosoft.sharedservice.model.service;

import com.ubicuosoft.sharedservice.model.common.constant.HttpStatusMessages;
import com.ubicuosoft.sharedservice.model.common.exception.SpecificExceptionHandler;
import com.ubicuosoft.sharedservice.model.dto.response.FileResponse.FileResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Paths;

import static com.ubicuosoft.sharedservice.model.common.constant.ServerConfiguration.UPLOAD_SERVER;

@Service
public class RetriveFileService {
//        1.	validateGetFilePathRequest
//        2.	fetchFilePath
//        3.	buildFilePathResponse

    public FileResponse execute(String sourceDirectory, String fileNameWithExtension) {
        validateGetFilePathRequest(sourceDirectory, fileNameWithExtension);
        String filePath = fetchFilePath(sourceDirectory, fileNameWithExtension);
        return buildFilePathResponse(filePath);
    }

    private void validateGetFilePathRequest(String sourceDirectory, String fileNameWithExtension) {
    }

    private String fetchFilePath(String sourceDirectory, String fileNameWithExtension) {
        try {
            File file = Paths.get(UPLOAD_SERVER + File.separator + sourceDirectory, fileNameWithExtension).toFile();

            if (!file.exists()) {
                throw new SpecificExceptionHandler(HttpStatus.NOT_FOUND, HttpStatusMessages.NOT_FOUND);
            }

            return file.getAbsolutePath();
        } catch (Exception e) {
            throw new SpecificExceptionHandler(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }

    private FileResponse buildFilePathResponse(String filePath) {
        return FileResponse.builder()
                .filePath(filePath)
                .build();
    }
}
