package ljx.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author：罗金星 date 2019/1/1 22:18
 **/
@Controller
@EnableAutoConfiguration
public class HelloWorldController {

    @ResponseBody
    @RequestMapping("/hello")
    public String Hello() {
        return "HelloWorld!";
    }
}
