package com.gd.micro_services_oracle_cloud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ScheduleReportService {

    @Autowired
    private FileOSService fileOSService;

    @Autowired
    private EmailService emailService;

    private List<String> emails = Arrays.asList("gabrieldutra45@gmail.com");

    private final long SEVEN_DAYS_IN_MILLISECONDS = 604800000;

    @Scheduled(fixedRate = SEVEN_DAYS_IN_MILLISECONDS)
    public void sendReport() {
        try {
            String report = fileOSService.getReportFileContent("report.html");

            for (String email: emails) {
                emailService.sendReport(report, email);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
