package com.example.awsevent.domain;


import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table
public class Event {
    @PrimaryKey
    private UUID id;
    private String companyName;
    private LocalDateTime createdAt;
    private String message;
    private String time;
    private String eventType;
    private String date;
    private String eventSource;
    private String eventMessage;
    private String eventName;
    private String startTime;
    private String lastUpdatedTime;
    private String service;
    private String region;
    private String eventDescription;
    private String sourceIp;
    private String requestParameters;
    private String user;
    private String statusCode;
    private String mfaUsed;
}
