package com.thirdeyeconsulting.spring.boot.gh1927;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Description("A controller for handling requests for hello messages")
public class SampleController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/")
    @ResponseBody
    public Map<String, String> helloWorld() {
        return Collections.singletonMap("message", this.helloWorldService.getHelloMessage());
    }

    @RequestMapping("/foo")
    @ResponseBody
    public String foo() {
        throw new IllegalArgumentException("Server error");
    }
}
