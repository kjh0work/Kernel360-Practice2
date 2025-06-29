package com.fastcampus.kernel_practice2.controller;

import com.fastcampus.kernel_practice2.model.BookQueryParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path = "")
    public void hello(){
        var list = List.of("hello", "world");
        var element = list.get(2);

        log.info("element = {}", element);
    }









    /**
     * ch02까지의 내용
     */
//    @GetMapping("/hello")
//    public String hello() {
//        return "Hello Spring Boot";
//    }

    @GetMapping(path = "/echo/{message}/age/{age}/is-man/{isMan}")
    public String echo(@PathVariable(name = "message") String msg,
                       @PathVariable int age,
                       @PathVariable boolean isMan)
    {
        System.out.println("echo message : " + msg);
        System.out.println("echo age : " + age);
        System.out.println("echo isMan : " + isMan);

        return msg.toUpperCase();
    }

    //http://localhost:8080/api/book?category=IT&issuedYear=2023&issued-month=01&issued_day=31
    @GetMapping(path = "/book")
    public void queryParam(@RequestParam String category,
                           @RequestParam String issuedYear,
                           @RequestParam(name = "issued-month") String issuedMonth,
                           @RequestParam String issued_day)
    {
        System.out.println(category);
        System.out.println(issuedYear);
        System.out.println(issuedMonth);
        System.out.println(issued_day);

    }

    //http://localhost:8080/api/book2?category=IT&issuedYear=2023&issuedMonth=01&issuedDay=31
    @GetMapping(path = "/book2")
    public void queryParam(BookQueryParam bookQueryParam)
    {
        System.out.println(bookQueryParam);

    }

    //TODO 숫자 2개 받아서 덧셈과 곱셈 출력

    //http://localhost:8080/api/add?first=10&second=20
    @GetMapping("/add")
    public String add(@RequestParam int first, @RequestParam int second) {

        return String.valueOf(first+second);
    }

    //http://localhost:8080/api/multi?first=10&second=20
    @GetMapping("/multi")
    public String multi(@RequestParam int first, @RequestParam int second) {

        return String.valueOf(first*second);
    }
}
