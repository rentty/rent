package com.rent.service;

import java.io.IOException;
import java.io.InputStream;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.domain.ThumbImageConfig;
import com.github.tobato.fastdfs.proto.storage.DownloadCallback;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import com.github.tobato.fastdfs.service.FastFileStorageClient;


@Service
public class FastDFSClientUtil {

    @Value("${fdfs.reqHost}")
    private String reqHost;

    @Value("${fdfs.reqPort}")
    private String reqPort;

    @Autowired
    private FastFileStorageClient storageClient;

    /**
     *
     * @param file
     * @return 访问地址
     * @throws IOException
     */

    public String uploadFile(MultipartFile file) throws IOException {

        StorePath storePath = storageClient.uploadFile((InputStream) file.getInputStream(), file.getSize(), FilenameUtils.getExtension(file.getOriginalFilename()), null);
        System.out.println(storePath.getPath());
        return getResAccessUrl(storePath);
    }


    /**
     * 封装文件完整URL地址
     *
     * @param storePath
     * @return
     */
    private String getResAccessUrl(StorePath storePath) {
        String fileUrl = "http://" + reqHost + ":" + reqPort + "/" + storePath.getPath();
        return fileUrl;
    }

}