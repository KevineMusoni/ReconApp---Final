package com.example.demo.resource;

import com.example.demo.model.Response;
import com.example.demo.service.implementation.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

import static java.time.LocalDateTime.now;
import static java.util.Map.of;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserResource {
   private final UserServiceImpl userService;

   @GetMapping("list")
    public ResponseEntity<Response> getUsers() throws InterruptedException{
       TimeUnit.SECONDS.sleep(1);
       return ResponseEntity.ok(
               Response.builder()
                       .timeStamp(now())
                       .data(of("users", userService.list(50000)))
                       .message("Users retrieved")
                       .status(OK)
                       .statusCode(OK.value())
                       .build()
       );
   }
}
