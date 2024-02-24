package seeds.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import seeds.first.constant.HomeConst;

@RestController
public class MainController {

    @GetMapping("/")
    public String home(){

        return HomeConst.WELCOME_SENTENCE.getMessage();
    }
}
