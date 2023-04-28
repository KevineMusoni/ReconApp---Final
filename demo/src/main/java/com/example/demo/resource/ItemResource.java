package com.example.demo.resource;


import com.example.demo.model.Response;
import com.example.demo.service.implementation.ItemServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

import static java.time.LocalDateTime.now;
import static java.util.Map.of;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemResource {

    private final ItemServiceImpl itemService;
    @GetMapping("/list")
    public ResponseEntity<Response> getItems() throws InterruptedException{
        TimeUnit.SECONDS.sleep(1);
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("items", itemService.list(50000)))
                        .message("Items retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

}
