package com.fastcampus.kernel_practice2.controller;

import com.fastcampus.kernel_practice2.model.BookRequest;
import com.fastcampus.kernel_practice2.model.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public String post(
            @RequestBody BookRequest bookRequest
            )
    {
        System.out.println(bookRequest);

        return bookRequest.toString();
    }

    @PostMapping("/user")
    public String user(
            @RequestBody UserRequest user
    ){
        System.out.println(user);
        return user.toString();
    }
}
