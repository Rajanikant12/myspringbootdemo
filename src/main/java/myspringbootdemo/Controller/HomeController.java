package myspringbootdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

@GetMapping("/test")
    public String hello1(){
        return "This is testing from controller";
    }




    
    @GetMapping("/")
        public String hello(){
            return "This is testing";
    }

}
