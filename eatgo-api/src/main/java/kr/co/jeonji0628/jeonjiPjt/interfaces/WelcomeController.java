package kr.co.jeonji0628.jeonjiPjt.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome(){
        return "Hello World";
    }
}
