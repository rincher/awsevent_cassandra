package com.example.awsevent.controller;

import com.example.awsevent.dto.EventRequestDto;
import com.example.awsevent.service.AppendService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/documents")
@RequiredArgsConstructor

public class EventController {
    private final AppendService appendService;

    @PostMapping("/append")
    public ResponseEntity<?> appendData(@RequestBody EventRequestDto eventRequestDto){
        return appendService.appendData(eventRequestDto);
    }
}
