package com.fastcampus.kernel_practice2.controller;

import com.fastcampus.kernel_practice2.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public void put(@RequestBody UserRequest userRequest ){
        log.info("Request : {}", userRequest);
    }
}
