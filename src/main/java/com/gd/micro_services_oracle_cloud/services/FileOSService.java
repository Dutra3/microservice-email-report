package com.gd.micro_services_oracle_cloud.services;

import com.gd.micro_services_oracle_cloud.config.OSClientConfiguration;
import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@Service
public class FileOSService {

    String bucketName = "analysis-reports";
    String nameSpace = "gurrlkbdawrb";

    @Autowired
    private OSClientConfiguration clientConfiguration;

    public String getReportFileContent(String fileName) {
        GetObjectRequest objectRequest = GetObjectRequest.builder()
                .namespaceName(nameSpace)
                .bucketName(bucketName)
                .objectName(fileName)
                .build();

        try {
            GetObjectResponse objectResponse = clientConfiguration.getObjectStorage().getObject(objectRequest);
            InputStream inputStream = objectResponse.getInputStream();

            return new BufferedReader(new InputStreamReader(inputStream)).lines().collect(Collectors.joining());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }
}
