package com.codeIntern.pumbkin.services;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

//Amit  Kumar //

// This service uploading the file and save to the databases //
@Service
public class FileUploadService {
    public byte[] store(MultipartFile file) throws IOException {
        return file.getBytes();
    }


}
